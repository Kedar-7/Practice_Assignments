package com.hexaware.springjpa.service;

import java.util.List;

import com.hexaware.springjpa.entity.Player;

public interface IPlayerService {
	public List<Player> getAllPlayers();
	public List<Player> findByName(String name); 
	public Player addPlayer(Player player);
	public void insertPlayers(Player player);
	public List<String> findPlayersByTeamName(String teamName);
}
