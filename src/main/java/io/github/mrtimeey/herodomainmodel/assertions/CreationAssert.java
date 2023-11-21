package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

import java.util.function.Consumer;
import java.util.function.Function;

public class CreationAssert extends AbstractObjectAssert<CreationAssert, Creation> {

   private ArtInformationAssert savedAppearance;

   public CreationAssert(Creation actual) {
      super(actual, CreationAssert.class);
   }

   public CreationAssert(Creation actual, ArtInformationAssert appearance) {
      super(actual, CreationAssert.class);
      savedAppearance = appearance;
   }

   public CreationAssert hasCreator(String... creators) {
      isNotNull();
      Assertions.assertThat(actual.creators()).contains(creators);
      return this;
   }

   public CreationAssert containsAppearanceValue(String value, Function<Appearance, String> mappingFunction) {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances())
            .map(mappingFunction)
            .contains(value);
      return this;
   }

   public CreationAssert hasFirstAppearance(Appearance... firstAppearances) {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).contains(firstAppearances);
      return this;
   }

   public CreationAssert hasOnlyFirstAppearance(Appearance... firstAppearances) {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).containsExactly(firstAppearances);
      return this;
   }

   public CreationAssert hasOnlyCreator(String... creators) {
      isNotNull();
      Assertions.assertThat(actual.creators()).containsExactly(creators);
      return this;
   }

   public CreationAssert doesNotHaveFirstAppearance(Appearance... firstAppearances) {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).doesNotContain(firstAppearances);
      return this;
   }

   public CreationAssert doesNotHaveCreator(String... creators) {
      isNotNull();
      Assertions.assertThat(actual.creators()).doesNotContain(creators);
      return this;
   }

   public CreationAssert hasNoFirstAppearance() {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).isEmpty();
      return this;
   }

   public CreationAssert hasNoCreators() {
      isNotNull();
      Assertions.assertThat(actual.creators()).isEmpty();
      return this;
   }

   public ArtInformationAssert mapToArtInformation() {
      if (savedAppearance == null) {
         failWithMessage("Invalid use of mapping! Can only be called if Appearance was visited!");
      }
      return savedAppearance;
   }

}
