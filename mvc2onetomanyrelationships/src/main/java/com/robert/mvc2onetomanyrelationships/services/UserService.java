package com.robert.mvc2onetomanyrelationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.mvc2onetomanyrelationships.models.User;
import com.robert.mvc2onetomanyrelationships.repositories.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
	public User create( User user) {
		return userRepo.save(user);
	}
	
	public User getOne(Long id) {
		Optional<User> potentialUser = userRepo.findById(id);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	public User getOne(String email) {
		Optional<User> potentialUser = userRepo.findByEmail(email);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}

}
