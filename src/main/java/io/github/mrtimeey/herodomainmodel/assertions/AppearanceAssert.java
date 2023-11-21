package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.ArtInformation;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import io.github.mrtimeey.herodomainmodel.model.LivingStatus;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class AppearanceAssert extends AbstractObjectAssert<AppearanceAssert, ArtInformation> {

   private SuperHeroAssert savedSuperHero;

   public AppearanceAssert(ArtInformation actual) {
      super(actual, AppearanceAssert.class);
   }

   public AppearanceAssert(ArtInformation actual, SuperHeroAssert superHero) {
      super(actual, AppearanceAssert.class);
      savedSuperHero = superHero;
   }

   public AppearanceAssert hasReality(String reality) {
      isNotNull();
      Assertions.assertThat(actual.reality()).isEqualTo(reality);
      return this;
   }

   public AppearanceAssert hasCreation(Creation creation) {
      isNotNull();
      Assertions.assertThat(actual.creation()).isEqualTo(creation);
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

   public CreationAssert mapToCreation() {
      return new CreationAssert(actual.creation(), this);
   }

   public SuperHeroAssert mapToSuperHero() {
      if (savedSuperHero == null) {
         failWithMessage("Invalid use of mapping! Can only be called if SuperHero was visited!");
      }
      return savedSuperHero;
   }

}
