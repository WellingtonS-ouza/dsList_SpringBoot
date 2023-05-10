package com.wellington.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellington.dslist.dto.GameListDTO;
import com.wellington.dslist.dto.GameMinDTO;
import com.wellington.dslist.entities.GameList;
import com.wellington.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
	  List<GameList> result = gameListRepository.findAll();
	  List<GameListDTO> dto = result.stream().map(x-> new GameListDTO(x)).toList();
	  
	  return dto;
	}
}
