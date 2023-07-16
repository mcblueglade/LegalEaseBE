package com.legalbase.backend.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "region_group")
public class RegionGroup implements Serializable {
  private static final long serialVersionUID = 2146779647815390131L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  @Id
  private String id;
  private String name;
  private String slug;
  @OneToOne
  private RegionArea regionArea;
}


