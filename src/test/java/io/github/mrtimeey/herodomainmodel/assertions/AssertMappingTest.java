package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.ArtInformation;
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
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.DECEASED;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.FORMERLY_DECEASED;
import static org.assertj.core.api.Assertions.fail;

class AssertMappingTest {

   private SuperHero hero;

   @BeforeEach
   void setup() {
      hero = SuperHero.of(
            "Dr. Robert Bruce Banner",
            "Hulk",
            Gender.MALE,
            ArtInformation.of(
                  "Earth-616",
                  Creation.of(
                        List.of("Stan Lee", "Jack Kirby"),
                        List.of(Appearance.of("Incredible Hulk #1", "March, 1962"))
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
   void testMappingBetweenAssertions() {
      Assertions.assertThat(hero)
            .hasName("Dr. Robert Bruce Banner")
            .hasAlias("Hulk")
            .hasGender(Gender.MALE)
            .mapToAppearance()
            .hasReality("Earth-616")
            .hasLivingStatus(ALIVE)
            .hasLivingStatus(FORMERLY_DECEASED)
            .hasOnlyLivingStatus(ALIVE, FORMERLY_DECEASED)
            .doesNotHaveLivingStatus(DECEASED)
            .mapToCreation()
            .hasCreator("Stan Lee", "Jack Kirby")
            .hasFirstAppearance(Appearance.of("Incredible Hulk #1", "March, 1962"))
            .hasOnlyFirstAppearance(Appearance.of("Incredible Hulk #1", "March, 1962"))
            .mapToArtInformation()
            .mapToSuperHero()
            .mapToPersonalInformation()
            .hasIdentity(PUBLIC)
            .hasCitizenship("American, Sakaaran");
   }

   @Test
   void testMappingError_creationAssert() {
      try {
         Assertions.assertThat(hero.artInformation().creation()).mapToArtInformation();
      } catch (AssertionError e) {
         return;
      }
      fail("Assertion did not fail");
   }

   @Test
   void testMappingError_appearanceAssert() {
      try {
         Assertions.assertThat(hero.artInformation()).mapToSuperHero();
      } catch (AssertionError e) {
         return;
      }
      fail("Assertion did not fail");
   }

   @Test
   void testMappingError_personalInformationAssert() {
      try {
         Assertions.assertThat(hero.personalInformation()).mapToSuperHero();
      } catch (AssertionError e) {
         return;
      }
      fail("Assertion did not fail");
   }

}