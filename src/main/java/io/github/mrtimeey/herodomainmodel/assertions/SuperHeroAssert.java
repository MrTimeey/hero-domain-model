package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Gender;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class SuperHeroAssert extends AbstractObjectAssert<SuperHeroAssert, SuperHero> {

   public SuperHeroAssert(SuperHero actual) {
      super(actual, SuperHeroAssert.class);
   }

   public static SuperHeroAssert assertThat(SuperHero actual) {
      return new SuperHeroAssert(actual);
   }

   public SuperHeroAssert hasName(String name) {
      isNotNull();
      Assertions.assertThat(actual.name()).isEqualTo(name);
      return this;
   }

   public SuperHeroAssert hasAlias(String alias) {
      isNotNull();
      Assertions.assertThat(actual.currentAlias()).isEqualTo(alias);
      return this;
   }

   public SuperHeroAssert hasGender(Gender gender) {
      isNotNull();
      Assertions.assertThat(actual.gender()).isEqualTo(gender);
      return this;
   }

   public AppearanceAssert mapToAppearance() {
      return AppearanceAssert.assertThat(actual.appearance(), actual);
   }

   public PersonalInformationAssert mapToPersonalInformation() {
      return PersonalInformationAssert.assertThat(actual.personalInformation(), actual);
   }


}
