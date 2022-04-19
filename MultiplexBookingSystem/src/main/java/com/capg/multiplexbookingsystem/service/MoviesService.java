package com.capg.multiplexbookingsystem.service;

import java.util.List;


import org.springframework.stereotype.Repository;


import com.capg.multiplexbookingsystem.model.Movies;

@Repository
public interface MoviesService {
	
//	List <Movies> findByAdmin_AdminId(Long adminId);
//	Optional<Movies> findByMovieIdAndAdmin_AdminId(Long movieId, Long adminId);
	
	Movies addMovies(Movies movies);
	//boolean transferFund(int from, int to, double amt) throws AccountException;
	List<Movies> showMoviess();
	void delAccount(Long moviesId);
	//Product updateAccount(Long productId);
	java.util.Optional<Movies> showMoviesById(Long moviesId);
	



}
