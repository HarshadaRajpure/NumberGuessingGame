package com.prc.numberGuessing.NumberGuessingGame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prc.numberGuessing.NumberGuessingGame.service.GameService;

@RestController
@RequestMapping("/api")
public class GameController {

	private GameService gameService;

	public GameController(GameService gameService) {
		super();
		this.gameService = gameService;
	}
	
	@GetMapping("restart")
	public String restart() {
		gameService.restart();
		return "New game started..You have 3 attempts left";
	}
	
	@GetMapping("/guess")
	public String guess(@RequestParam int number) {
	return gameService.guess(number);
}
}
