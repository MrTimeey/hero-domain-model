package io.github.mrtimeey.herodomainmodel.core;

import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class HeroFactoryTest {

   @Test
   void testGetAllHeroes() {
      List<SuperHero> result = HeroFactory.allHeroes();

      assertThat(result).hasSize(22);
   }

   @Test
   void testGetSinisterSix() {
      List<SuperHero> result = HeroFactory.sinisterSix();

      assertThat(result).hasSize(6);
   }

   @Test
   void testGetAvengers() {
      List<SuperHero> result = HeroFactory.avengers();

      assertThat(result).hasSize(7);
   }

   @Test
   void testGetHeroWithPredicate() {
      Optional<SuperHero> result = HeroFactory.hero(h -> "Hulk".equals(h.currentAlias()));

      assertThat(result).isPresent();
   }

}