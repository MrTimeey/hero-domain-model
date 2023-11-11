package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Arrays;
import java.util.List;

@JsonSerialize
public record Appearance(String reality, Creation creation, List<LivingStatus> livingStatuses) {
   public static Appearance of(String reality, Creation creation) {
      return new Appearance(reality, creation, List.of());
   }

   public static Appearance of(String reality, Creation creation, LivingStatus... livingStatuses) {
      return new Appearance(reality, creation, Arrays.stream(livingStatuses).toList());
   }

   public static Appearance of(String reality, Creation creation, List<LivingStatus> livingStatuses) {
      return new Appearance(reality, creation, livingStatuses);
   }
}
