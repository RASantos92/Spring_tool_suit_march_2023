package com.robert.manytomanydemo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

@Entity // declares that it is going to be apart of mysql
@Table(name = "games") // gives the table name of the model
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generates an auto incrementing 
	private Long id;
	
	@NotEmpty(message = "Title is required!") // validation for strings
	private String title;
	
	@ManyToMany(fetch= FetchType.LAZY)
	@JoinTable(
			name="games_genres",
			joinColumns = @JoinColumn(name="game_id"),
			inverseJoinColumns = @JoinColumn(name = "genre_id")
	)
	private List<Genre> genres;
	
	@Transient
	private String genresFromForm;
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getGenresFromForm() {
		return genresFromForm;
	}

	public void setGenresFromForm(String genresFromForm) {
		this.genresFromForm = genresFromForm;
	}
	
	
	
	
	

}
