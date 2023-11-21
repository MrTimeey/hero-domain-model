package io.github.mrtimeey.herodomainmodel.core;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import io.github.sfrick.jcontrols.Try;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

final class DataLoader {

   private DataLoader() {
      throw new IllegalStateException("Do not instantiate this class");
   }

   static List<SuperHero> getAllHeroes() {
      return Try
            .withResource(() -> DataLoader.class.getResourceAsStream("heroes.json"))
            .of(DataLoader::parseInputStream)
            .orElse(List.of());
   }

   private static List<SuperHero> parseInputStream(InputStream resource) throws IOException {
      if (resource == null) return List.of();
      String inputObject = IOUtils.toString(resource, StandardCharsets.UTF_8);
      TypeReference<List<SuperHero>> typeReference = new TypeReference<>() {
      };
      return ObjectConversionUtils.toObject(inputObject, typeReference).orElse(List.of());
   }

}
