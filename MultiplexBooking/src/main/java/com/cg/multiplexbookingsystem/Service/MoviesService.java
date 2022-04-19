package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.multiplexbookingsystem.Repository.MoviesRepository;
import com.cg.multiplexbookingsystem.entity.Movies;


@Service
public class MoviesService implements IMoviesService{
	@Autowired
	public MoviesRepository moviesRepository;
	
	@Override
	public Movies insertMovies(Movies newMovies) {
		// TODO Auto-generated method stub
		return moviesRepository.save(newMovies);
	}

	@Override
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return moviesRepository.findAll();
	}

	@Override
	public Optional<Movies> getMovies(Long mid) {
		// TODO Auto-generated method stub
		return moviesRepository.findById(mid);
	}

	
	@Override
	public void deleteMovies(Long moviesId) {
		// TODO Auto-generated method stub
		moviesRepository.deleteById(moviesId);
	}

}


