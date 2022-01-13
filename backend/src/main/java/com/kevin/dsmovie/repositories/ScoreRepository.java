package com.kevin.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.dsmovie.entities.Score;
import com.kevin.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
