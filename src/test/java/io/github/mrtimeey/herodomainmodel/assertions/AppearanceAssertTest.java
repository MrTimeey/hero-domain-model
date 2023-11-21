package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class AppearanceAssertTest {

   private Appearance appearance;

   @BeforeEach
   void setup() {
      appearance = Appearance.of("Incredible Hulk #1", "March, 1962", "Hulk");
   }

   @Test
   void testAssert() {
      Assertions.assertThat(appearance)
            .hasTitle("Incredible Hulk #1")
            .hasPublished("March, 1962")
            .hasPersonality("Hulk");
   }

   @Test
   void testAssert_noPersonality() {
      Assertions.assertThat(Appearance.of("Incredible Julk #1", "March, 1962"))
            .hasNoPersonality();
   }

}