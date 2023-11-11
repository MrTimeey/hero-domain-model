package io.github.mrtimeey.herodomainmodel.core.data;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

final class DataLoader {

   private static List<SuperHero> getAllHeroes() {
      try (InputStream resource = DataLoader.class.getClass().getResourceAsStream("heroes.json")) {
         String inputObject = IOUtils.toString(resource, StandardCharsets.UTF_8);
         TypeReference<List<SuperHero>> typeReference = new TypeReference<>() {
         };
         return ObjectConversionUtils.toObject(inputObject, typeReference).orElse(List.of());
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }

}
