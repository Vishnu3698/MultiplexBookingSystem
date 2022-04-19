package com.cg.onlinemovieticketbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="movies")

public class Movies {
@Id
@Column(name ="moviesid")
private Long moviesId;
@Column(name="moviesname")
private String moviesName;
public Movies() {
	// TODO Auto-generated constructor stub
}
public Movies(Long moviesId, String moviesName) {
	super();
	this.moviesId = moviesId;
	this.moviesName = moviesName;
}
public Long getMoviesId() {
	return moviesId;
}
public void setMoviesId(Long moviesId) {
	this.moviesId = moviesId;
}
public String getMoviesName() {
	return moviesName;
}
public void setMoviesName(String moviesName) {
	this.moviesName = moviesName;
}
@Override
public String toString() {
	return "Movies [moviesId=" + moviesId + ", moviesName=" + moviesName + "]";
}

}