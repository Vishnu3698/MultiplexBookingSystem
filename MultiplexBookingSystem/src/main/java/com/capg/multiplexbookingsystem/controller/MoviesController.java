package com.capg.multiplexbookingsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.multiplexbookingsystem.dao.MoviesRepository;
import com.capg.multiplexbookingsystem.exception.MoviesException;
import com.capg.multiplexbookingsystem.model.Movies;
import com.capg.multiplexbookingsystem.service.MoviesService;



@CrossOrigin(origins = "*")
@RequestMapping("/api/v4")
@RestController
public class MoviesController {
	@Autowired
	private MoviesService moviesService;
	
	@Autowired
	private MoviesRepository moviesRepository;

	@PutMapping("/moviess/{id}")
	public ResponseEntity<Movies> updateEmployee(@PathVariable(value = "id") Long moviesId,
			@RequestBody Movies moviesDetails) throws MoviesException {
		Movies movies = moviesRepository.findById(moviesId)
				.orElseThrow(() -> new MoviesException("Movies not found for this id :: " + moviesId));

		movies.setMovieName(moviesDetails.getMovieName());
		movies.setDescription(moviesDetails.getDescription());
		movies.setAdmin(moviesDetails.getAdmin());
		
		final Movies updatedMovies = moviesRepository.save(movies);
		return ResponseEntity.ok(updatedMovies);
	}

	@DeleteMapping("/moviess/{moviesId}")
	public ResponseEntity<String> delmoviess(@PathVariable("moviesId") Long moviesId) {
		System.out.println("Acc ID:"+moviesId);
		try {
			moviesService.delAccount(moviesId);
		} catch (Exception ex) {
			throw new MoviesException(ex.getMessage());
		}
		return new ResponseEntity<String>("movies Deleted.", HttpStatus.OK);
	}


	@GetMapping("/moviess")
	public ResponseEntity<List<Movies>> getMoviess() {
		List<Movies> moviesList = moviesService.showMoviess();
		return new ResponseEntity<List<Movies>>(moviesList, HttpStatus.OK);
	}

	
	@GetMapping("/moviess/{moviesId}")
	public ResponseEntity<Optional<Movies>> getMoviesById(@PathVariable("moviesId") Long moviesId) {
		Optional<Movies> movies = moviesService.showMoviesById(moviesId);
	return new ResponseEntity<Optional<Movies>>(movies, HttpStatus.OK);
}

	@PostMapping("/moviess")
	public Movies createMovies(@RequestBody Movies movies) {
		return moviesService.addMovies(movies);
	}

}
