package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Arrays;
import java.util.List;

@JsonSerialize
public record Creation(List<String> creators, List<String> firstAppearances) {
   public static Creation of() {
      return new Creation(List.of(), List.of());
   }

   public static Creation of(List<String> creators, List<String> firstAppearances) {
      return new Creation(creators, firstAppearances);
   }
}
