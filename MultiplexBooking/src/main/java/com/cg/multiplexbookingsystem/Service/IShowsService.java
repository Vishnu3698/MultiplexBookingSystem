package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import com.cg.multiplexbookingsystem.entity.Shows;

public interface IShowsService {
	public Shows insertShows(Shows newShows) ;

	public List<Shows> getAllShows();

	public Optional<Shows> getShows(Long sid);

	public Shows updateShows(Shows oldShows);

	public void deleteShows(Long showsId);

	

}

