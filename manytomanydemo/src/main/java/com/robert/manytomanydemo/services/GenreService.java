package com.robert.manytomanydemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.manytomanydemo.models.Genre;
import com.robert.manytomanydemo.repositories.GenreRepository;

@Service
public class GenreService {
	
	
	private static GenreRepository genreRepo;

	public GenreService(GenreRepository genreRepo) {
		this.genreRepo = genreRepo;
	}

	public Genre getOne(Long id) {
		Optional<Genre> genre = genreRepo.findById(id);
		return genre.isPresent() ? genre.get() : null;
	}

	public List<Genre> getAll() {
		return (List<Genre>) genreRepo.findAll();
	}

	public Genre create(Genre dojo) {
		return genreRepo.save(dojo);
	}

	public Genre update(Genre dojo) {
		return genreRepo.save(dojo);
	}

	public void delete(Long id) {
		genreRepo.deleteById(id);
	}

}
