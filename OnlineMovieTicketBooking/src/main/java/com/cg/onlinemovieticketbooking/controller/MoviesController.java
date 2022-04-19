package com.cg.onlinemovieticketbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinemovieticketbooking.entity.Movies;
import com.cg.onlinemovieticketbooking.exception.MoviesNotFoundException;
import com.cg.onlinemovieticketbooking.service.IMoviesService;

@RestController
@RequestMapping("/movies")
public class MoviesController {
	@Autowired
	public IMoviesService moviesService;
	
	@PostMapping("/insertmovies")
	public Movies insertMovies(@RequestBody Movies newMovies) {
		return moviesService.insertMovies(newMovies);
		
	}
	
	@GetMapping("/movieslist")
	public List<Movies> getAllMovies(){
		return moviesService.getAllMovies();
	}
	
	@GetMapping("/movieslist/{id}")
	public  Optional<Movies> getMovies(@PathVariable("id") Long mid){
		return moviesService.getMovies(mid);
	}
	

	@DeleteMapping("/deletemovies/{id}")
	public void deleteMovies(@PathVariable("id") Long moviesid) {
		moviesService.deleteMovies(moviesid);
	}
	
	@PutMapping("/updatemovies/{id}")
	public Movies updateMovies(@PathVariable("id") Long moviesid,@RequestBody Movies updateMovies) throws MoviesNotFoundException {
		Optional<Movies> movies = getMovies(moviesid);
		Movies oldMovies =movies.get();
		if(movies.isPresent()) {
			oldMovies.setMoviesName(updateMovies.getMoviesName());
			
			
		}else {
			throw new MoviesNotFoundException("movies not found with id = " +moviesid);
		}
		
		return moviesService.updateMovies(oldMovies);
	}
}
