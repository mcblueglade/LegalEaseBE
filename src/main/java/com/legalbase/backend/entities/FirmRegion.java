package com.legalbase.backend.entities;

import com.legalbase.backend.common.enums.CrossBorderCapability;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "firm_region")
public class FirmRegion implements Serializable {
  private static final long serialVersionUID = 8825090307287798421L;

  @Id
  @Column(name = "firm_region_id", nullable = false, updatable = false)
  private String firmRegionId;

  @OneToOne
  private Region region;
  private boolean booking;
  @Enumerated(EnumType.STRING)
  private CrossBorderCapability crossBorderCapability;
  private Long clientSatisfactionRating;
  private Long expertiseAndReputationRating;

  @ManyToOne
  @JoinColumn(name = "firm_id")
  private Firm firm;
}


