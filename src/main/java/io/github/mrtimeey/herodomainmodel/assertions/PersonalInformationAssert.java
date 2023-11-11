package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Identity;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class PersonalInformationAssert extends AbstractObjectAssert<PersonalInformationAssert, PersonalInformation> {

   private static SuperHero savedSuperHero;

   public PersonalInformationAssert(PersonalInformation actual) {
      super(actual, PersonalInformationAssert.class);
   }

   public static PersonalInformationAssert assertThat(PersonalInformation actual) {
      return new PersonalInformationAssert(actual);
   }

   public static PersonalInformationAssert assertThat(PersonalInformation actual, SuperHero superHero) {
      savedSuperHero = superHero;
      return new PersonalInformationAssert(actual);
   }

   public PersonalInformationAssert hasIdentity(Identity identity) {
      isNotNull();
      Assertions.assertThat(actual.identity()).isEqualTo(identity);
      return this;
   }

   public PersonalInformationAssert hasCitizenship(String citizenship) {
      isNotNull();
      Assertions.assertThat(actual.citizenship()).isEqualTo(citizenship);
      return this;
   }

   public SuperHeroAssert mapToSuperHero() {
      if (savedSuperHero == null) {
         failWithMessage("Invalid use of mapping! Can only be called if SuperHero was visited!");
      }
      return SuperHeroAssert.assertThat(savedSuperHero);
   }

}
