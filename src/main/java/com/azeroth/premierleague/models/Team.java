package com.azeroth.premierleague.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String stadium;

  @ManyToOne
  @JoinColumn(name = "league_id", referencedColumnName = "id")
  private League league;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStadium() {
    return stadium;
  }
  
  public void setStadium(String stadium) {
    this.stadium = stadium;
  }

  public League getLeague() {
    return league;
  }

  public void setLeague(League league) {
    this.league = league;
  }

}
