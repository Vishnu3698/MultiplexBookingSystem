package com.cg.onlinemovieticketbooking.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlinemovieticketbooking.entity.Movies;

public interface IMoviesService {
	public Movies insertMovies(Movies newMovies);

	public List<Movies> getAllMovies();

	public  Optional<Movies> getMovies(Long mid);

	public void deleteMovies(Long moviesid);

	public Movies updateMovies(Movies updateMovies);
}
