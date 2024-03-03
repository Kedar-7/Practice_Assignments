package com.hexaware.springjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.springjpa.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>  {
	
	@Query("SELECT p FROM Player p where p.playerName = :name")
	List<Player> findByPlayerName(String name);
	
		@Modifying
	  @Query(value = "INSERT INTO Players (player_id, player_name, jersey_no, role, total_matches, team_name, state, description) " +
              "VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)", nativeQuery = true)
	  void insertPlayers(int playerId, String playerName, int jerseyNumber, String role, int totalMatches, String teamName, String stateName, String description);
		
		
		@Query(value = "select player_name from player_details where team_name = ?1", nativeQuery = true)
		 List<String> findPlayersByTeamName(String teamName);
}

