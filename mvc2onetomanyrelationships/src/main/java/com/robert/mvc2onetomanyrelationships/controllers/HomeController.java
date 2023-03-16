package com.robert.mvc2onetomanyrelationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.robert.mvc2onetomanyrelationships.models.Donation;
import com.robert.mvc2onetomanyrelationships.models.User;
import com.robert.mvc2onetomanyrelationships.services.DonationService;
import com.robert.mvc2onetomanyrelationships.services.UserService;

@Controller
public class HomeController {

	public final DonationService donationServ;
	public final UserService userServ;
	public HomeController(DonationService donationServ,UserService userServ) {
		this.donationServ = donationServ;
		this.userServ = userServ;
	}
	
	@GetMapping("/")
	public String index() {
		return "main/dashboard.jsp";
	}
	
	@GetMapping("/user/create")
	public String createUser(@ModelAttribute("newUser") User user){
		return "user/create.jsp";
	}
	
	@PostMapping("/user/process/new")
	public String processNewUser(@Valid @ModelAttribute("newUser") User newUser,BindingResult result) {
		if(result.hasErrors()) {
			return "user/create.jsp";
		}
		userServ.create(newUser);
		return "redirect:/";
	}
	
	@GetMapping("/donations/create")
	public String createDonation(@ModelAttribute("newDonation") Donation donation, Model model) {
		
		model.addAttribute("allUsers", userServ.findAll());
		return "donation/create.jsp";
	}
	
	@PostMapping("/donations/process/new")
	public String processNewDonation(@Valid @ModelAttribute("newDonation") Donation newDonation, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allUsers", userServ.findAll());
			return "donation/create.jsp";
		}
		donationServ.create(newDonation);
		return "redirect:/";
	}
	
}
