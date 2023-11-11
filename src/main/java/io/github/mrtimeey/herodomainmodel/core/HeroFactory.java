package io.github.mrtimeey.herodomainmodel.core;

import io.github.mrtimeey.herodomainmodel.model.SuperHero;

import java.util.Arrays;
import java.util.List;

public class HeroFactory {

   public List<SuperHero> sinisterSix() {
      return DataLoader.getAllHeroes().stream()
            .filter(this::isPartOfSinisterSix)
            .toList();
   }

}
