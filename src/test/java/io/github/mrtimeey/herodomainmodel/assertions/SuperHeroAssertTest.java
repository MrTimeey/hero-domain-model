package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import io.github.mrtimeey.herodomainmodel.model.Gender;
import io.github.mrtimeey.herodomainmodel.model.Identity;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.github.mrtimeey.herodomainmodel.model.Identity.PUBLIC;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.ALIVE;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.FORMERLY_DECEASED;

class SuperHeroAssertTest {

   private SuperHero hero;

   @BeforeEach
   void setup() {
      hero = SuperHero.of(
            "Dr. Robert Bruce Banner",
            "Hulk",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                        List.of("Stan Lee", "Jack Kirby"),
                        List.of("Incredible Hulk #1 (March, 1962)")
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "American, Sakaaran"
            )
      );
   }

   @Test
   void testSuperHeroAssert() {
      PersonalInformation expectedPersonalInformation = PersonalInformation.of(PUBLIC, "American, Sakaaran");
      Creation expectedCreation = Creation.of(List.of("Stan Lee", "Jack Kirby"), List.of("Incredible Hulk #1 (March, 1962)"));
      Appearance expectedAppearance = Appearance.of("Earth-616", expectedCreation, ALIVE, FORMERLY_DECEASED);

      Assertions.assertThat(hero)
            .hasName("Dr. Robert Bruce Banner")
            .hasAlias("Hulk")
            .hasGender(Gender.MALE)
            .hasPersonalInformation(expectedPersonalInformation)
            .hasAppearance(expectedAppearance);
   }

}