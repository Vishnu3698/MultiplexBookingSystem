package com.cg.movieticketbookinhsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movieticketbookinhsystem.entity.Hall;
import com.cg.movieticketbookinhsystem.repository.HallRepository;





@Service
public class HallService implements IHallService {
	@Autowired
	public HallRepository hallRepository;
	
	@Override
	public Hall insertHall(Hall newHall) {
		// TODO Auto-generated method stub
		return hallRepository.save(newHall);
	}

	@Override
	public List<Hall> getAllHall() {
		// TODO Auto-generated method stub
		return hallRepository.findAll();
	}

	@Override
	public Optional<Hall> getHall(Long hid) {
		// TODO Auto-generated method stub
		return hallRepository.findById(hid);
	}

	@Override
	public Hall updateHall(Hall updateHall) {
		return hallRepository.save(updateHall);
		
	}
	
	@Override
	public void deleteHall(Long hallId) {
		// TODO Auto-generated method stub
		hallRepository.deleteById(hallId);
	}

}


