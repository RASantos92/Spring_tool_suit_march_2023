package com.robert.mvc2onetomanyrelationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	public String index(Model model) {
		model.addAttribute("allDonations", donationServ.getAll());
		model.addAttribute("allUsers", userServ.getAll());
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
	
	@GetMapping("/user/{id}")
	public String showOneUser(@PathVariable("id")Long id,Model model) {
		User oneUser = userServ.getOne(id);
		model.addAttribute("user", oneUser);
		return "user/showOne.jsp";
	}
	
	@GetMapping("/donations/create")
	public String createDonation(@ModelAttribute("newDonation") Donation donation, Model model) {
		
		model.addAttribute("allUsers", userServ.getAll());
		return "donation/create.jsp";
	}
	
	@PostMapping("/donations/process/new")
	public String processNewDonation(@Valid @ModelAttribute("newDonation") Donation newDonation, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allUsers", userServ.getAll());
			return "donation/create.jsp";
		}
		donationServ.create(newDonation);
		return "redirect:/";
	}
	
	@GetMapping("/donations/{id}/edit")
	public String editDonation(@PathVariable("id") Long id,Model model) {
		Donation donation = donationServ.getOne(id);
		model.addAttribute("donation", donation);
		return "donation/edit.jsp";
	}
	
	@PutMapping("/donations/process/{id}")
	public String processEditDonation(@Valid @ModelAttribute("donation") Donation donation,BindingResult result) {
		if(result.hasErrors()) {
			return "donation/edit.jsp";
		}
		donationServ.update(donation);
		return "redirect:/";
	}
	
	@DeleteMapping("/donations/delete/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.delete(id);
		return "redirect:/";
	}
	
}
