package com.legalbase.backend.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 * Defines Firm Ranking Data Transfer Object
 */
@Builder
@Data
public class FirmRankingDto implements Serializable {
  private static final long serialVersionUID = -8659204094790175469L;

  private String id;
  private FirmDto firm;
  private String trend;
  private boolean diversity;
  private String tier;
  private Long position;

}
