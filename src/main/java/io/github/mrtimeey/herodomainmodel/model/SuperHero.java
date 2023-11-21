package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public record SuperHero(String name, String currentAlias, Gender gender, ArtInformation artInformation, PersonalInformation personalInformation) {
   public static SuperHero of(String name, String currentAlias, Gender gender, ArtInformation artInformation, PersonalInformation personalInformation) {
      return new SuperHero(name, currentAlias, gender, artInformation, personalInformation);
   }
}
