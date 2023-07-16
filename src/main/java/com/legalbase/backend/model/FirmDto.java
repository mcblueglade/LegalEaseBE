package com.legalbase.backend.model;

import java.io.Serializable;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

/**
 * Defines Firm Data Transfer Object
 */
@Builder
@Data
public class FirmDto implements Serializable {
  private static final long serialVersionUID = 1954238979145736356L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  private String id;
  private String name;
  private String slug;
  private String imageUrl;
  private String websiteUrl;
  private Set<BadgeDto> badges;
  private Set<AwardDto> awards;
  private Set<FirmRegionDto> firmRegions;

}
