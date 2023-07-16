package com.legalbase.backend.model;

import java.io.Serializable;
import lombok.Data;

/**
 * Defines Region Data Transfer Object
 */
@Data
public class RegionDto implements Serializable {
  private static final long serialVersionUID = -6219165329270894227L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  private String id;
  private String name;
  private String slug;
  private RegionGroupDto regionGroup;
}
