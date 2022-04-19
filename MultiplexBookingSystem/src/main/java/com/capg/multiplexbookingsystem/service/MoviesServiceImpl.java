package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.multiplexbookingsystem.dao.MoviesRepository;
import com.capg.multiplexbookingsystem.model.Movies;


@Service
@Transactional
public class MoviesServiceImpl implements MoviesService{
	@Autowired
	MoviesRepository moviesRepo;

	@Override
	public Movies addMovies(Movies movies) {
		// TODO Auto-generated method stub
		return moviesRepo.save(movies);
	}

	@Override
	public List<Movies> showMoviess() {
		// TODO Auto-generated method stub
		return moviesRepo.findAll();
	}

	@Override
	public void delAccount(Long moviesId) {
		// TODO Auto-generated method stub
		moviesRepo.deleteById(moviesId);
	}

	/*
	 * @Override public Product updateAccount(Long productId) { // TODO
	 * Auto-generated method stub
	 * 
	 * Optional<Product> product = productRepo.findById(productId);
	 * 
	 * }
	 */

	@Override
	public Optional<Movies> showMoviesById(Long moviesId) {
		// TODO Auto-generated method stub
		return moviesRepo.findById(moviesId);
	}
	

}
