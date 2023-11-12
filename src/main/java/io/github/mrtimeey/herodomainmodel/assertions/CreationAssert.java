package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class CreationAssert extends AbstractObjectAssert<CreationAssert, Creation> {

   private AppearanceAssert savedAppearance;

   public CreationAssert(Creation actual) {
      super(actual, CreationAssert.class);
   }

   public CreationAssert(Creation actual, AppearanceAssert appearance) {
      super(actual, CreationAssert.class);
      savedAppearance = appearance;
   }

   public CreationAssert hasCreators(String creators) {
      isNotNull();
      Assertions.assertThat(actual.creators()).isEqualTo(creators);
      return this;
   }

   public CreationAssert hasFirstAppearance(String... firstAppearances) {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).contains(firstAppearances);
      return this;
   }

   public CreationAssert hasOnlyFirstAppearance(String... firstAppearances) {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).containsExactly(firstAppearances);
      return this;
   }

   public CreationAssert doesNotHaveFirstAppearance(String... firstAppearances) {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).doesNotContain(firstAppearances);
      return this;
   }

   public CreationAssert hasNoFirstAppearance() {
      isNotNull();
      Assertions.assertThat(actual.firstAppearances()).isEmpty();
      return this;
   }

   public AppearanceAssert mapToAppearance() {
      if (savedAppearance == null) {
         failWithMessage("Invalid use of mapping! Can only be called if Appearance was visited!");
      }
      return savedAppearance;
   }

}
