package io.github.mrtimeey.herodomainmodel.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public enum LivingStatus {ALIVE, DECEASED, FORMERLY_DECEASED}
