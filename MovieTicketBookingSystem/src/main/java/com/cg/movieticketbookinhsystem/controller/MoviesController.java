package com.cg.movieticketbookinhsystem.controller;

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

import com.cg.movieticketbookinhsystem.entity.Movies;
import com.cg.movieticketbookinhsystem.service.IMoviesService;




@RestController
@RequestMapping("/Movies")
public class MoviesController {
	@Autowired
	public IMoviesService moviesService;
	
	@PostMapping("/insertMovies")
	public Movies insertMovies(@RequestBody Movies newMovies) {
		return moviesService.insertMovies(newMovies);
		
	}
	@GetMapping("/moviesList")
	public List<Movies> getAllMovies(){
		return moviesService.getAllMovies();
	}

	@GetMapping("/moviesList/{id}")
		public Optional<Movies> getMovies(@PathVariable ("id") Long mid){
   return moviesService.getMovies(mid);
	}
	@DeleteMapping("/deletemovies/{id}")
	public void deleteMovies(@PathVariable ("id")Long moviesId) {
		moviesService.deleteMovies(moviesId);
	}
	
	
	}




