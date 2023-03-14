package com.robert.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class DonationApiController {

	public final DonationService donationServ;
	
	public DonationApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/donations")
	public List<Donation> findAllDonations(){
		return donationServ.getAll();
	}
	
	@PostMapping("/donations")
	public Donation createDonation(@RequestParam(value="donationName",required=false) String donationName, @RequestParam("donor") String donor, @RequestParam("quantity") Integer quantity) {
		Donation donation = new Donation(donationName, donor, quantity);
		return donationServ.create(donation);
	}
	
	@GetMapping("/donations/{id}")
	public Donation oneDonation(@PathVariable("id") Long id) {
		return donationServ.getOne(id);
	}
	
	@PutMapping("/donations/{id}")
	public Donation editOneDonation(@PathVariable("id") Long id,@RequestParam(value="donationName",required=false) String donationName, @RequestParam("donor") String donor, @RequestParam("quantity") Integer quantity) {
		Donation updateDonation = donationServ.getOne(id);
		if(donationName != "") {	
			updateDonation.setDonationName(donationName);
		}
		updateDonation.setDonor(donor);
		updateDonation.setQuantity(quantity);
		return donationServ.update(updateDonation);
	}
	
	@DeleteMapping("/donations/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.delete(id);
		return id + " was Deleted";
	}

}
