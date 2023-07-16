package com.legalbase.backend.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "firm")
public class Firm implements Serializable {
  private static final long serialVersionUID = 7979644134966239084L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  @Id
  @Column(name = "firm_id", nullable = false, updatable = false)
  private String firmId;
  private String name;
  private String slug;
  private String imageUrl;
  private String websiteUrl;

  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Badge> badges;
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Award> awards;
  @OneToMany(fetch = FetchType.EAGER, mappedBy = "firm", cascade = CascadeType.ALL)
  private Set<FirmRegion> firmRegions;
}

