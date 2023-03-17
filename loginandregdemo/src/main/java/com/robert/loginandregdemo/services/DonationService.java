package com.robert.loginandregdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.loginandregdemo.models.Donation;
import com.robert.loginandregdemo.repositories.DonationRepository;

@Service
public class DonationService {
	
	
	private final DonationRepository donationRepo;
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
	}

	public Donation getOne(Long id) {
		Optional<Donation> donation = donationRepo.findById(id);
		return donation.isPresent() ? donation.get() : null;
	}

	public List<Donation> getAll() {
		return (List<Donation>) donationRepo.findAll();
	}

	public Donation create(Donation dojo) {
		return donationRepo.save(dojo);
	}

	public Donation update(Donation dojo) {
		return donationRepo.save(dojo);
	}

	public void delete(Long id) {
		donationRepo.deleteById(id);
	}


}
