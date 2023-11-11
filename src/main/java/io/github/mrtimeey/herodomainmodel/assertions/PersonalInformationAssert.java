package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class CreationAssert extends AbstractObjectAssert<CreationAssert, Creation> {

   public CreationAssert(Creation actual) {
      super(actual, Creation.class);
   }

   public static CreationAssert assertThat(Creation actual) {
      return new CreationAssert(actual);
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


}
