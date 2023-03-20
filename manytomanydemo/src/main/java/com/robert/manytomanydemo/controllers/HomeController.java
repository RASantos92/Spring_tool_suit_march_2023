package com.robert.manytomanydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.robert.manytomanydemo.models.Game;
import com.robert.manytomanydemo.services.GameService;

@Controller
public class HomeController {
	
	private final GameService gameServ;
	public HomeController(GameService gameServ) {
		this.gameServ = gameServ;
	}
	
	
	@GetMapping("/")
	public String home(@ModelAttribute("game") Game game, Model model) {
		model.addAttribute("allGames", gameServ.getAll());
		return "main/dashBoard.jsp";
	}

}
