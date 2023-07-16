package com.legalbase.backend.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "award")
public class Award implements Serializable {
  private static final long serialVersionUID = 5772820690158601007L;
  //TODO define award pojo
  @Id
  @Column(name = "award_id", nullable = false, updatable = false)
  private String awardId;

  @ManyToOne
  @JoinColumn(name = "firm_id")
  private Firm firm;
}



