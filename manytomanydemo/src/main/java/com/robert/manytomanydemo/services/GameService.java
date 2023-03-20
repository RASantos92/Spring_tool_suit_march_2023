package com.robert.manytomanydemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.manytomanydemo.models.Game;
import com.robert.manytomanydemo.models.Genre;
import com.robert.manytomanydemo.repositories.GameRepository;
import com.robert.manytomanydemo.repositories.GenreRepository;

@Service
public class GameService {

	private final GameRepository gameRepo;
	private final GenreRepository genreRepo;

	public GameService(GameRepository gameRepo,GenreRepository genreRepo) {
		this.gameRepo = gameRepo;
		this.genreRepo = genreRepo;
	}
	
//	*************************create game with genre logic****************************
	public Genre getOneGenre(String genreName) {
		Optional<Genre> genre = genreRepo.findByName(genreName);
		return genre.isPresent() ? genre.get() : null;
	}
	
	public Genre createGenreIfNotInDataBase(String genreName) {
		if(getOneGenre(genreName) == null) {
			Genre newGenre = new Genre();
			newGenre.setName(genreName);
			return genreRepo.save(newGenre);
		}
		return getOneGenre(genreName);
	}
	
	public Game createGameWithGenre(Game game) {
		 String[] genresFromForm = game.getGenresFromForm().split(",");
		 ArrayList<Genre> genresToBeAdded = new ArrayList<Genre>();
		 for(String genre : genresFromForm) {
			 genresToBeAdded.add(createGenreIfNotInDataBase(genre));
		 }
		 game.setGenres(genresToBeAdded);
		 return gameRepo.save(game);
	}
	
	
	
	//********************************************************************************

	public Game getOne(Long id) {
		Optional<Game> game = gameRepo.findById(id);
		return game.isPresent() ? game.get() : null;
	}

	public List<Game> getAll() {
		return (List<Game>) gameRepo.findAll();
	}

	public Game create(Game dojo) {
		return gameRepo.save(dojo);
	}

	public Game update(Game dojo) {
		return gameRepo.save(dojo);
	}

	public void delete(Long id) {
		gameRepo.deleteById(id);
	}

}
