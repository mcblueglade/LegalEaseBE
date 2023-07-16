package com.legalbase.backend.model;

import java.io.Serializable;
import lombok.Data;

/**
 * Defines Firm Region Data Transfer Object
 */
@Data
public class FirmRegionDto implements Serializable {
  private static final long serialVersionUID = -365751897982074721L;

  private String id;
  private RegionDto region;
  private boolean booking;
  private String crossBorderCapability;
  private Long clientSatisfactionRating;
  private Long expertiseAndReputationRating;
}
