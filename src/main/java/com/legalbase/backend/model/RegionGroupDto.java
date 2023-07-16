package com.legalbase.backend.model;

import java.io.Serializable;
import lombok.Data;

/**
 * Defines  Region Group Data Transfer Object
 */
@Data
public class RegionGroupDto implements Serializable {
  private static final long serialVersionUID = -3956746336284578267L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  private String id;
  private String name;
  private String slug;
  private RegionAreaDto regionArea;
}
