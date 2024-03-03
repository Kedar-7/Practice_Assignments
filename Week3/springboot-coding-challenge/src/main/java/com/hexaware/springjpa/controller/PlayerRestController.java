package com.hexaware.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springjpa.entity.Player;
import com.hexaware.springjpa.service.IPlayerService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayerRestController {
	
	@Autowired
	private IPlayerService service;
	
	@PostMapping("/add")
	public Player addPlayer(@RequestBody Player player) {
		return service.addPlayer(player);
	}
	
	@GetMapping("/getall")
	public List<Player> getAll(){
		return service.getAllPlayers();
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Player> findByName(@PathVariable String name) {
		return service.findByName(name);
	}
	
	@PostMapping("/addplayer")
	public void insertPlayers(@RequestBody Player player) {
		service.insertPlayers(player);
	}
	
	@GetMapping("/get-players-by-teamname/{teamName}")
    public List<String> getPlayersByTeamName(@PathVariable String teamName) {
    return service.findPlayersByTeamName(teamName);
    }

}
