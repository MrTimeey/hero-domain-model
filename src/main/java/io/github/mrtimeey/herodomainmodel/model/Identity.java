package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public enum Identity {
   PUBLIC("True identity is known to the general populace"),
   SECRET("True identity is not known to the general populace and authorities"),
   NO_DUAL("Do not currently have any other identity, alter ego, or alias");

   private String description;

   Identity(String description) {
      this.description = description;
   }

   public String getDescription() {
      return description;
   }
}
