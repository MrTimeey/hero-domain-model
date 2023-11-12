package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.ALIVE;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.DECEASED;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.FORMERLY_DECEASED;

class AppearanceAssertTest {

   private Appearance appearance;

   @BeforeEach
   void setup() {
      appearance = Appearance.of(
            "Earth-616",
            Creation.of(
                  "Stan Lee, Jack Kirby",
                  "Incredible Hulk #1 (March, 1962)"
            ),
            ALIVE, FORMERLY_DECEASED
      );
   }

   @Test
   void testAssert() {
      Creation expectedCreation = Creation.of("Stan Lee, Jack Kirby", "Incredible Hulk #1 (March, 1962)");

      Assertions.assertThat(appearance)
            .hasReality("Earth-616")
            .hasLivingStatus(ALIVE)
            .hasLivingStatus(FORMERLY_DECEASED)
            .hasOnlyLivingStatus(ALIVE, FORMERLY_DECEASED)
            .doesNotHaveLivingStatus(DECEASED)
            .hasCreation(expectedCreation);
   }

   @Test
   void testAssert_noLivingStatus() {
      Appearance appearance = Appearance.of("Earth-616", Creation.of("Creator"));

      Assertions.assertThat(appearance)
            .hasNoLivingStatus();
   }

}