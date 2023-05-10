package com.wellington.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.dslist.dto.GameMinDTO;
import com.wellington.dslist.entities.Game;
import com.wellington.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
	  List<GameMinDTO> result =	gameRepository.findAll();
	  //List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
	  
	  return result;
	}
}