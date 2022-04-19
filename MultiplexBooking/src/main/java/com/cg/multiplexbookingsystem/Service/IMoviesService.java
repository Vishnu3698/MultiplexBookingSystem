package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import com.cg.multiplexbookingsystem.entity.Movies;



public interface IMoviesService {
	public Movies insertMovies(Movies newMovies) ;

	public List<Movies> getAllMovies();

	public Optional<Movies> getMovies(Long mid);


	public void deleteMovies(Long moviesId);

	

}


