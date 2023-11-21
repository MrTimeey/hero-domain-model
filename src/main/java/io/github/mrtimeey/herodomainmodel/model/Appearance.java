package io.github.mrtimeey.herodomainmodel.model;

public record Appearance(String title, String published, String personality) {
   public static Appearance of(String title, String published) {
      return new Appearance(title, published, "");
   }

   public static Appearance of(String title, String published, String personality) {
      return new Appearance(title, published, personality);
   }
}
