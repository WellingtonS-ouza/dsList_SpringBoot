package com.wellington.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
