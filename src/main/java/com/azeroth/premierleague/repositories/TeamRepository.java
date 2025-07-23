package com.azeroth.premierleague.repositories;

import com.azeroth.premierleague.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepository extends JpaRepository<Team, Long>{
  
}
