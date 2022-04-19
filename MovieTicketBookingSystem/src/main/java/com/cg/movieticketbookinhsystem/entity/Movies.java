package com.cg.movieticketbookinhsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="movies123")
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MovieId")
	private Long movieId;
	private String movieName;
	public Movies() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + "]";
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Movies(String movieName) {
		super();
		
		this.movieName = movieName;
	}

}

