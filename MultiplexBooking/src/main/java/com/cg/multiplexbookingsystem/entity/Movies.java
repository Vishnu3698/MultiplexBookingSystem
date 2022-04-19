package com.cg.multiplexbookingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="movies123")
public class Movies {
	@Id
	@Column(name="MoviesId")
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
	public Movies(Long movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

}
