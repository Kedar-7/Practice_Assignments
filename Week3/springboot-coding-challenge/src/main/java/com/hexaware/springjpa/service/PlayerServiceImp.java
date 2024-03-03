package com.hexaware.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjpa.entity.Player;
import com.hexaware.springjpa.repository.PlayerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlayerServiceImp implements IPlayerService {
	
	
	@Autowired
	private PlayerRepository repo;

	@Override
	public List<Player> getAllPlayers() {
		return repo.findAll();
	}

	@Override
	public Player addPlayer(Player player) {
		return repo.save(player);
	}

	@Override
	public List<Player> findByName(String name) {
		return repo.findByPlayerName(name);
	}

	@Override
	public void insertPlayers(Player player) {
		if(isValidPlayer(player)){
		 repo.insertPlayers(player.getPlayerId(),player.getPlayerName(),player.getJerseyNo(),player.getRole(),player.getTotalMatches(),player.getTeamName(),player.getState(),player.getDescription());
		} 
		
	}
		 
		 private boolean isValidPlayer(Player player) {
		        return player.getRole().equals("Batsman") || player.getRole().equals("Bowler") || player.getRole().equals("Keeper") &&
		                player.getJerseyNo() >= 1 && player.getJerseyNo() <= 100 &&
		                player.getTotalMatches() > 0;
		    }
		 
		 public List<String> findPlayersByTeamName(String teamName) {
				return repo.findPlayersByTeamName(teamName);
				}
	
	

	
	}
	
		
	


