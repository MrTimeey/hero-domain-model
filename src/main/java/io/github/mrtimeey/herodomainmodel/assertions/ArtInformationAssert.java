package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.ArtInformation;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import io.github.mrtimeey.herodomainmodel.model.LivingStatus;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class ArtInformationAssert extends AbstractObjectAssert<ArtInformationAssert, ArtInformation> {

   private SuperHeroAssert savedSuperHero;

   public ArtInformationAssert(ArtInformation actual) {
      super(actual, ArtInformationAssert.class);
   }

   public ArtInformationAssert(ArtInformation actual, SuperHeroAssert superHero) {
      super(actual, ArtInformationAssert.class);
      savedSuperHero = superHero;
   }

   public ArtInformationAssert hasReality(String reality) {
      isNotNull();
      Assertions.assertThat(actual.reality()).isEqualTo(reality);
      return this;
   }

   public ArtInformationAssert hasCreation(Creation creation) {
      isNotNull();
      Assertions.assertThat(actual.creation()).isEqualTo(creation);
      return this;
   }

   public ArtInformationAssert hasLivingStatus(LivingStatus... livingStatuses) {
      isNotNull();
      Assertions.assertThat(actual.livingStatuses()).contains(livingStatuses);
      return this;
   }

   public ArtInformationAssert hasOnlyLivingStatus(LivingStatus... livingStatuses) {
      isNotNull();
      Assertions.assertThat(actual.livingStatuses()).containsExactly(livingStatuses);
      return this;
   }

   public ArtInformationAssert doesNotHaveLivingStatus(LivingStatus... livingStatuses) {
      isNotNull();
      Assertions.assertThat(actual.livingStatuses()).doesNotContain(livingStatuses);
      return this;
   }

   public ArtInformationAssert hasNoLivingStatus() {
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
