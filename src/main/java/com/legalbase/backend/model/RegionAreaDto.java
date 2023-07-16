package com.legalbase.backend.model;

import java.io.Serializable;
import lombok.Data;

/**
 * Defines Firm Region Area Data Transfer Object
 */
@Data
public class RegionAreaDto implements Serializable {
  private static final long serialVersionUID = -8539302686190971769L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  private String id;
  private String name;
  private String slug;
}
