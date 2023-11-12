package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Identity;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.github.mrtimeey.herodomainmodel.model.Identity.PUBLIC;

class PersonalInformationAssertTest {

   private PersonalInformation personalInformation;

   @BeforeEach
   void setup() {
      personalInformation = PersonalInformation.of(
            Identity.PUBLIC,
            "American, Sakaaran"
      );
   }

   @Test
   void testPersonalInformationAssert() {
      Assertions.assertThat(personalInformation)
            .hasIdentity(PUBLIC)
            .hasCitizenship("American, Sakaaran");
   }

}