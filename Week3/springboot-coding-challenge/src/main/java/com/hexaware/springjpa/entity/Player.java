package com.hexaware.springjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="Players")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "player-sequence")
 	@SequenceGenerator(name = "player-sequence", sequenceName = "player_sequence", initialValue = 111)
   
	private int playerId;
	
	@Pattern(regexp = "^[A-Z][a-z]*\\s[A-Z][a-z]*$")
	private String playerName;
	private int jerseyNo;
	private String role;
	private int totalMatches;
	private String teamName;
	private String state;
	private String description;
	
	
	public Player() {
		super();
	}


	public Player(int playerId, @Pattern(regexp = "^[A-Z][a-z]*\\s[A-Z][a-z]*$") String playerName, int jerseyNo,
			String role, int totalMatches, String teamName, String state, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNo = jerseyNo;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.state = state;
		this.description = description;
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getJerseyNo() {
		return jerseyNo;
	}


	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public int getTotalMatches() {
		return totalMatches;
	}


	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNo=" + jerseyNo + ", role="
				+ role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", state=" + state
				+ ", description=" + description + "]";
	}
	

	
	

	
}
