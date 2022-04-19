package com.cg.movieticketbookinhsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movieticketbookinhsystem.entity.Shows;
import com.cg.movieticketbookinhsystem.exception.ShowsNotFoundException;
import com.cg.movieticketbookinhsystem.service.IShowsService;



@RestController
@RequestMapping("/Shows")

public class ShowsController {
	@Autowired
	public IShowsService showsService;
	
	@PutMapping("/insertShows")
	public Shows insertShows(@RequestBody Shows newShows) {
		return showsService.insertShows(newShows);
		
	}
	@GetMapping("/showsList")
	public List<Shows> getAllShows(){
		return showsService.getAllShows();
	}

	@GetMapping("/showsList/{id}")
		public Optional<Shows> getShows(@PathVariable ("id") Long sid){
   return showsService.getShows(sid);
	}
	@DeleteMapping("/deleteshows/{id}")
	public void deleteShows(@PathVariable ("id")Long showsId) {
		showsService.deleteShows(showsId);
	}
	
	@PutMapping("/updateShows/{id}")
	public Shows updateShows(@PathVariable("id") Long showsId,@RequestBody Shows updateShows) throws ShowsNotFoundException {
		Optional<Shows> shows = getShows(showsId);
		Shows oldShows = shows.get();
		if(shows.isPresent()) {
			oldShows.setToDate(updateShows.getToDate());
			oldShows.setFromDate(updateShows.getFromDate());
			
		}else {
			throw new ShowsNotFoundException("shows not found with id = " +showsId);
		}
		
		return showsService.updateShows(oldShows);
	}
	}




