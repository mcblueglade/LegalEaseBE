package com.legalbase.backend.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "firm_ranking")
public class FirmRanking implements Serializable {
  private static final long serialVersionUID = -8347562186160551492L;

  @Id
  @Column(name = "firm_ranking_id", nullable = false, updatable = false)
  private String firmRankingId;
  @OneToOne
  private Firm firm;
  private String trend;
  private boolean diversity;
  private String tier;
  private Long position;
}
