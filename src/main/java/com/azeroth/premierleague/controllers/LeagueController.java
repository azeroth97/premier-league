package com.azeroth.premierleague.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.azeroth.premierleague.models.League;
import com.azeroth.premierleague.services.LeagueService;

@Controller
public class LeagueController {

  @Autowired
  private LeagueService leagueService;

  @GetMapping("/leagues/{leagueId}")
  public String getleague(@PathVariable("leagueId") Long leagueId, Model model) {
    League league = leagueService.findLeague(leagueId);
    model.addAttribute("league", league);
    return "leagues/league";
  }

  @PostMapping("leagues/new")
  public League createLeague(@RequestBody League league) {
    return leagueService.saveLeague(league);
  }
}
