package com.azeroth.premierleague.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String stadium;

  public Team() {
    
  }

  public Team(String name, String stadium) {
    this.name = name;
    this.stadium = stadium;
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
}
