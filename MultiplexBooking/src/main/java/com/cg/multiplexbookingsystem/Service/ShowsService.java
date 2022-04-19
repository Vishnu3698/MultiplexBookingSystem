package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.multiplexbookingsystem.Repository.ShowsRepository;
import com.cg.multiplexbookingsystem.entity.Shows;



@Service
public class ShowsService implements IShowsService
{
	@Autowired
	public ShowsRepository showsRepository;
	
	@Override
	public Shows insertShows(Shows newShows) {
		// TODO Auto-generated method stub
		return showsRepository.save(newShows);
	}

	@Override
	public List<Shows> getAllShows() {
		// TODO Auto-generated method stub
		return showsRepository.findAll();
	}

	@Override
	public Optional<Shows> getShows(Long sid) {
		// TODO Auto-generated method stub
		return showsRepository.findById(sid);
	}

	@Override
	public Shows updateShows(Shows updateShows) {
		return showsRepository.save(updateShows);
		
	}
	
	@Override
	public void deleteShows(Long showsId) {
		// TODO Auto-generated method stub
		showsRepository.deleteById(showsId);
	}

}
