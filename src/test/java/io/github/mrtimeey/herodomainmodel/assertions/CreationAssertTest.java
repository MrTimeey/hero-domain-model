package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CreationAssertTest {

   private Creation creation;

   @BeforeEach
   void setup() {
      creation = Creation.of(
            List.of("Stan Lee", "Jack Kirby"),
            List.of(Appearance.of("Incredible Hulk #1", "March, 1962"))
      );
   }

   @Test
   void testAssert() {
      Assertions.assertThat(creation)
            .hasCreator("Stan Lee", "Jack Kirby")
            .hasOnlyCreator("Stan Lee", "Jack Kirby")
            .hasCreator("Stan Lee")
            .doesNotHaveCreator("Tim")
            .hasFirstAppearance(Appearance.of("Incredible Hulk #1", "March, 1962"))
            .hasOnlyFirstAppearance(Appearance.of("Incredible Hulk #1", "March, 1962"))
            .doesNotHaveFirstAppearance(Appearance.of("Avenging Spider-Man #9", "July, 2012"))
            .containsAppearanceValue("Incredible Hulk #1", Appearance::title);
   }

   @Test
   void testAssert_noFirstAppearanceAndNoCreators() {
      Creation creation = Creation.of(List.of(), List.of());

      Assertions.assertThat(creation)
            .hasNoCreators()
            .hasNoFirstAppearance();
   }

}