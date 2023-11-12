package io.github.mrtimeey.herodomainmodel.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

final class ObjectConversionUtils {

   private static final ObjectMapper om = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

   private ObjectConversionUtils() {
      throw new IllegalStateException("Do not instantiate this class");
   }

   static <T> Optional<T> toObject(String objString, TypeReference<T> typeReference) {
      try {
         T value = om.readValue(objString, typeReference);
         return Optional.of(value);
      } catch (Exception e) {
         return Optional.empty();
      }
   }

}
