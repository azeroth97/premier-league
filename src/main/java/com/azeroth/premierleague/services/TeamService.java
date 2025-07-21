package com.azeroth.premierleague.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azeroth.premierleague.models.Team;
import com.azeroth.premierleague.repositories.TeamRepository;

@Service
public class TeamService {
  @Autowired
  private TeamRepository teamRepository;

  public List<Team> getAllTeams() {
    return teamRepository.findAll();
  }

  public Team saveTeam(Team team) {
    return teamRepository.save(team);
  }
}
