package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Arrays;
import java.util.List;

@JsonSerialize
public record ArtInformation(String reality, Creation creation, List<LivingStatus> livingStatuses) {
   public static ArtInformation of(String reality, Creation creation) {
      return new ArtInformation(reality, creation, List.of());
   }

   public static ArtInformation of(String reality, Creation creation, LivingStatus... livingStatuses) {
      return new ArtInformation(reality, creation, Arrays.stream(livingStatuses).toList());
   }

   public static ArtInformation of(String reality, Creation creation, List<LivingStatus> livingStatuses) {
      return new ArtInformation(reality, creation, livingStatuses);
   }
}
