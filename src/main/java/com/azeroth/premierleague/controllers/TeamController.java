package com.azeroth.premierleague.controllers;

import com.azeroth.premierleague.models.Team;
import com.azeroth.premierleague.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class TeamController {

  @Autowired
  private TeamService teamService;

  @PostMapping("teams/new")
  public Team createTeam(@RequestBody Team team) {
    return teamService.saveTeam(team);
  }

}
