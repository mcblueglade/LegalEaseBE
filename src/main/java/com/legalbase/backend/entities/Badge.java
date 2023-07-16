package com.legalbase.backend.entities;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "badge")
public class Badge implements Serializable {
  private static final long serialVersionUID = -5514986848621845532L;

  //TODO Move id, name and slug to an Abstract class and extend this class

  @Id
  @Column(name = "badge_id", nullable = false, updatable = false)
  private String badgeId;
  private String name;
  private String slug;

}


