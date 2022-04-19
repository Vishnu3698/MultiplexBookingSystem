package com.capg.multiplexbookingsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movieid")
	private Long movieId;
	
	@Column(name = "moviename", nullable = false)
	private String movieName;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "adminId")
	private Admin admin;
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public Movies(Long movieId, String movieName, String description, Admin admin) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.description = description;
		this.admin = admin;
	}

	public Movies(String movieName, String description, Admin admin) {
		super();
		this.movieName = movieName;
		this.description = description;
		this.admin = admin;
	}

	public Movies(String movieName, String description) {
		super();
		this.movieName = movieName;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", description=" + description + ", admin="
				+ admin + "]";
	}
	
}
