package com.robert.loginandregdemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.robert.loginandregdemo.services.DonationService;
import com.robert.loginandregdemo.services.UserService;

@Controller
public class MainController {
	private final DonationService donationServ;
	private final UserService userServ;
	public MainController(DonationService donationServ,UserService userServ) {
		this.donationServ = donationServ;
		this.userServ = userServ;
	}

	@GetMapping("/")
	public String home(HttpSession session,Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/reg";
		}
		model.addAttribute("allDonations", donationServ.getAll());
		model.addAttribute("loggedInUser", userServ.getOne((Long) session.getAttribute("user_id")));
		return "main/dashboard.jsp";
	}
}
