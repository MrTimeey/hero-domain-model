package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Gender;
import io.github.mrtimeey.herodomainmodel.model.LivingStatus;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class AppearanceAssert extends AbstractObjectAssert<AppearanceAssert, Appearance> {

   public AppearanceAssert(Appearance actual) {
      super(actual, Appearance.class);
   }

   public static AppearanceAssert assertThat(Appearance actual) {
      return new AppearanceAssert(actual);
   }

   public AppearanceAssert hasReality(String reality) {
      isNotNull();
      Assertions.assertThat(actual.reality()).isEqualTo(reality);
      return this;
   }

   public AppearanceAssert hasLivingStatus(LivingStatus... livingStatuses) {
      isNotNull();
      Assertions.assertThat(actual.livingStatuses()).contains(livingStatuses);
      return this;
   }

   public AppearanceAssert hasOnlyLivingStatus(LivingStatus... livingStatuses) {
      isNotNull();
      Assertions.assertThat(actual.livingStatuses()).containsExactly(livingStatuses);
      return this;
   }

   public AppearanceAssert doesNotHaveLivingStatus(LivingStatus... livingStatuses) {
      isNotNull();
      Assertions.assertThat(actual.livingStatuses()).doesNotContain(livingStatuses);
      return this;
   }

   public AppearanceAssert hasNoLivingStatus() {
      isNotNull();
      Assertions.assertThat(actual.livingStatuses()).isEmpty();
      return this;
   }




}
