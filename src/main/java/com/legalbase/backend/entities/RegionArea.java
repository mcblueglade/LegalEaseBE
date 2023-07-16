package com.legalbase.backend.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "region_area")
public class RegionArea implements Serializable {
  private static final long serialVersionUID = -7055266779876689199L;

  //TODO Move id, name and slug to an Abstract class and extend this class
  @Id
  private String id;
  private String name;
  private String slug;
}


