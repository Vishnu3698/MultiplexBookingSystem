package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import com.cg.multiplexbookingsystem.entity.Hall;



public interface IHallService {
	public Hall insertHall(Hall newHall) ;

	public List<Hall> getAllHall();

	public Optional<Hall> getHall(Long hid);

	public Hall updateHall(Hall oldHall);

	public void deleteHall(Long hallId);

}
