package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.ArtInformation;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;

public class Assertions {

   protected Assertions() {
      // empty
   }

   public static SuperHeroAssert assertThat(SuperHero superHero) {
      return new SuperHeroAssert(superHero);
   }

   public static AppearanceAssert assertThat(ArtInformation artInformation) {
      return new AppearanceAssert(artInformation);
   }

   public static CreationAssert assertThat(Creation creation) {
      return new CreationAssert(creation);
   }

   public static PersonalInformationAssert assertThat(PersonalInformation personalInformation) {
      return new PersonalInformationAssert(personalInformation);
   }

}
