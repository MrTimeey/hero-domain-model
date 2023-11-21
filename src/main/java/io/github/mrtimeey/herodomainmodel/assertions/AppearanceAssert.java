package io.github.mrtimeey.herodomainmodel.assertions;

import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Identity;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;

public class AppearanceAssert extends AbstractObjectAssert<AppearanceAssert, Appearance> {

   public AppearanceAssert(Appearance actual) {
      super(actual, AppearanceAssert.class);
   }

   public AppearanceAssert hasTitle(String title) {
      isNotNull();
      Assertions.assertThat(actual.title()).isEqualTo(title);
      return this;
   }

   public AppearanceAssert hasPublished(String published) {
      isNotNull();
      Assertions.assertThat(actual.published()).isEqualTo(published);
      return this;
   }

   public AppearanceAssert hasPersonality(String personality) {
      isNotNull();
      Assertions.assertThat(actual.personality()).isEqualTo(personality);
      return this;
   }

   public AppearanceAssert hasNoPersonality() {
      isNotNull();
      Assertions.assertThat(actual.personality()).isEmpty();
      return this;
   }

}
