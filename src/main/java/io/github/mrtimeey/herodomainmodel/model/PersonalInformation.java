package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record PersonalInformation(Identity identity, String citizenship) {
   public static PersonalInformation of(Identity identity, String citizenship) {
      return new PersonalInformation(identity, citizenship);
   }
}
