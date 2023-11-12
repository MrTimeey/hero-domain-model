package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreationAssertTest {

   private Creation creation;

   @BeforeEach
   void setup() {
      creation = Creation.of(
            "Stan Lee, Jack Kirby",
            "Incredible Hulk #1 (March, 1962)"
      );
   }

   @Test
   void testAssert() {
      Assertions.assertThat(creation)
            .hasCreators("Stan Lee, Jack Kirby")
            .hasFirstAppearance("Incredible Hulk #1 (March, 1962)")
            .hasOnlyFirstAppearance("Incredible Hulk #1 (March, 1962)")
            .doesNotHaveFirstAppearance("Avenging Spider-Man #9 (July, 2012) (As Captain Marvel)");
   }

   @Test
   void testAssert_noFirstAppearance() {
      Creation creation = Creation.of("creator");

      Assertions.assertThat(creation)
            .hasNoFirstAppearance();
   }

}