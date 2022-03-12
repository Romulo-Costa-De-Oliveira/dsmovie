package com.rabolinhacoders.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabolinhacoders.dsmovie.entities.Score;
import com.rabolinhacoders.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	

}
