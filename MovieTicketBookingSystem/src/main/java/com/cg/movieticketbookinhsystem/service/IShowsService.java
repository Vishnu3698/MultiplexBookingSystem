package com.cg.movieticketbookinhsystem.service;


import java.util.List;
import java.util.Optional;

import com.cg.movieticketbookinhsystem.entity.Shows;



public interface IShowsService {
	public Shows insertShows(Shows newShows) ;

	public List<Shows> getAllShows();

	public Optional<Shows> getShows(Long sid);

	public Shows updateShows(Shows oldShows);

	public void deleteShows(Long showsId);

	

}