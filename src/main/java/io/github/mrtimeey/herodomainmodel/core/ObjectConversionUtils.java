package io.github.mrtimeey.herodomainmodel.core.data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;

final class ObjectConversionUtils {

   private ObjectConversionUtils() {
      throw new IllegalStateException("Do not instantiate this class");
   }

   private static final ObjectMapper om = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

   static Optional<String> toString(Object obj) {
      try {
         return Optional.of(om.writeValueAsString(obj));
      } catch (JsonProcessingException e) {
         return Optional.empty();
      }
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
