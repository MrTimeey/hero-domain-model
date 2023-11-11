package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Arrays;
import java.util.List;

@JsonSerialize
public record Creation(String creators, List<String> firstAppearances) {
   public static Creation of(String creators) {
      return new Creation(creators, List.of());
   }

   public static Creation of(String creators, String... firstAppearances) {
      return new Creation(creators, Arrays.stream(firstAppearances).toList());
   }

   public static Creation of(String creators, List<String> firstAppearances) {
      return new Creation(creators, firstAppearances);
   }
}
