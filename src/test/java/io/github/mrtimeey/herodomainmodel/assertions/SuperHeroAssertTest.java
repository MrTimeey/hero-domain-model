package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.core.HeroFactory;
import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import io.github.mrtimeey.herodomainmodel.model.Gender;
import io.github.mrtimeey.herodomainmodel.model.Identity;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.github.mrtimeey.herodomainmodel.model.Identity.PUBLIC;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.ALIVE;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.DECEASED;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.FORMERLY_DECEASED;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class CustomAssertionTest {

   private SuperHero hero;

   @BeforeEach
   void setup() {
      hero = HeroFactory.hero(h -> "Hulk".equals(h.currentAlias())).orElseThrow();
   }

   @Test
   void testSuperHeroAssert() {
      PersonalInformation expectedPersonalInformation = PersonalInformation.of(PUBLIC, "American, Sakaaran");
      Creation expectedCreation = Creation.of("Stan Lee, Jack Kirby", "Incredible Hulk #1 (March, 1962)");
      Appearance expectedAppearance = Appearance.of("Earth-616", expectedCreation, ALIVE, FORMERLY_DECEASED);

      Assertions.assertThat(hero)
            .hasName("Dr. Robert Bruce Banner")
            .hasAlias("Hulk")
            .hasGender(Gender.MALE)
            .hasPersonalInformation(expectedPersonalInformation)
            .hasAppearance(expectedAppearance);
   }

}