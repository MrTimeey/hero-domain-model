package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.ArtInformation;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.ALIVE;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.DECEASED;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.FORMERLY_DECEASED;

class ArtInformationAssertTest {

   private ArtInformation artInformation;

   @BeforeEach
   void setup() {
      artInformation = ArtInformation.of(
            "Earth-616",
            Creation.of(
                  List.of("Stan Lee", "Jack Kirby"),
                  List.of(Appearance.of("Incredible Hulk #1", "March, 1962"))
            ),
            ALIVE, FORMERLY_DECEASED
      );
   }

   @Test
   void testAssert() {
      Creation expectedCreation = Creation.of(List.of("Stan Lee", "Jack Kirby"), List.of(Appearance.of("Incredible Hulk #1", "March, 1962")));

      Assertions.assertThat(artInformation)
            .hasReality("Earth-616")
            .hasLivingStatus(ALIVE)
            .hasLivingStatus(FORMERLY_DECEASED)
            .hasOnlyLivingStatus(ALIVE, FORMERLY_DECEASED)
            .doesNotHaveLivingStatus(DECEASED)
            .hasCreation(expectedCreation);
   }

   @Test
   void testAssert_noLivingStatus() {
      ArtInformation artInformation = ArtInformation.of("Earth-616", Creation.of());

      Assertions.assertThat(artInformation)
            .hasNoLivingStatus();
   }

}