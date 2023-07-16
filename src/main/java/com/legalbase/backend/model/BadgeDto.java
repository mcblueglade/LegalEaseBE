package com.legalbase.backend.model;

import java.io.Serializable;
import lombok.Data;

/**
 * Defines Badge Data Transfer Object
 */
@Data
public class BadgeDto implements Serializable {
  private static final long serialVersionUID = -206324999555842044L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  private String id;
  private String name;
  private String slug;
}
