package io.github.mrtimeey.herodomainmodel.core;

import io.github.mrtimeey.herodomainmodel.model.SuperHero;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static io.github.mrtimeey.herodomainmodel.core.DataLoader.getAllHeroes;

public final class HeroFactory {

   private HeroFactory() {
      throw new IllegalStateException("Do not instantiate this class");
   }

   public static List<SuperHero> allHeroes() {
      return getAllHeroes();
   }

   public static Optional<SuperHero> hero(Predicate<SuperHero> searchPredicate) {
      return getAllHeroes().stream()
            .filter(searchPredicate)
            .findFirst();
   }

   public static List<SuperHero> sinisterSix() {
      return getAllHeroes().stream()
            .filter(HeroUtils::isPartOfSinisterSix)
            .toList();
   }

   public static List<SuperHero> avengers() {
      return getAllHeroes().stream()
            .filter(HeroUtils::isPartOfAvengers)
            .toList();
   }

}
