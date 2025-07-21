package com.azeroth.premierleague.controllers;

import com.azeroth.premierleague.models.Team;
import com.azeroth.premierleague.services.TeamService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class TeamController {

  @Autowired
  private TeamService teamService;

  @GetMapping("/teams")
  public String getTeams(Model model) {
    List<Team> teams = teamService.getAllTeams();
    model.addAttribute("teams", teams);
    return "teams";
  }
  
  @PostMapping("/new-team")
  public Team createTeam(@RequestBody Team team) {
    return teamService.saveTeam(team);
  }

}
