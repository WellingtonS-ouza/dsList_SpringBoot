package com.wellington.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
