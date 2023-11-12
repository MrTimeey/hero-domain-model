package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Gender;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class SuperHeroAssert extends AbstractObjectAssert<SuperHeroAssert, SuperHero> {

   public SuperHeroAssert(SuperHero actual) {
      super(actual, SuperHeroAssert.class);
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

   public SuperHeroAssert hasPersonalInformation(PersonalInformation personalInformation) {
      isNotNull();
      Assertions.assertThat(actual.personalInformation()).isEqualTo(personalInformation);
      return this;
   }

   public SuperHeroAssert hasAppearance(Appearance appearance) {
      isNotNull();
      Assertions.assertThat(actual.appearance()).isEqualTo(appearance);
      return this;
   }

   public AppearanceAssert mapToAppearance() {
      return new AppearanceAssert(actual.appearance(), this);
   }

   public PersonalInformationAssert mapToPersonalInformation() {
      return new PersonalInformationAssert(actual.personalInformation(), this);
   }


}
