package com.azeroth.premierleague.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azeroth.premierleague.models.League;
import com.azeroth.premierleague.repositories.LeagueRepository;

@Service
public class LeagueService {
  @Autowired
  private LeagueRepository leagueRepository;

  public League findLeague(Long league_id){
    Optional<League> optionalLeague = leagueRepository.findById(league_id);
    League league = optionalLeague.orElseThrow(() -> new IllegalArgumentException(
      "League not found with id: " + league_id + ". Please ensure the ID is correct "
    ));
    return league;
  }

  public League saveLeague(League league) {
    return leagueRepository.save(league);
  }
}
