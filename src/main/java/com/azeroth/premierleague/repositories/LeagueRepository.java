package com.azeroth.premierleague.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.azeroth.premierleague.models.League;


public interface LeagueRepository extends JpaRepository<League, Long>{
  
}
