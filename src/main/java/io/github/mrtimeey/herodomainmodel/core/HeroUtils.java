package io.github.mrtimeey.herodomainmodel.core;

import io.github.mrtimeey.herodomainmodel.model.SuperHero;

public final class HeroUtils {

   private HeroUtils() {
      throw new IllegalStateException("Do not instantiate this class");
   }

   public static boolean isPartOfSinisterSix(SuperHero hero) {
      return switch (hero.currentAlias()) {
         case "Doctor Octopus", "Vulture", "Electro", "Kraven the Hunter", "Mysterio", "Sandman" -> true;
         default -> false;
      };
   }

   public static boolean isPartOfAvengers(SuperHero hero) {
      return switch (hero.currentAlias()) {
         case "Hulk", "Thor", "Iron Man", "Hawkeye", "Scarlet Witch", "Black Widow", "Captain America" -> true;
         default -> false;
      };
   }
}
