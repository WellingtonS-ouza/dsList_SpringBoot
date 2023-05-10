package com.wellington.dslist.dto;

import com.wellington.dslist.entities.GameList;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class GameListDTO {

	
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
