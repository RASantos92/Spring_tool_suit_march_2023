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
import javax.validation.constraints.NotEmpty;

@Entity // declares that it is going to be apart of mysql
@Table(name = "genres") // gives the table name of the model
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generates an auto incrementing 
	private Long id;
	
	@NotEmpty
	private String name;
	
	@ManyToMany(fetch= FetchType.LAZY)
	@JoinTable(
			name="games_genres",
			joinColumns = @JoinColumn(name="genre_id"),
			inverseJoinColumns = @JoinColumn(name = "game_id")
	)
	private List<Game> games;

	public Genre() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	
	
	

}
