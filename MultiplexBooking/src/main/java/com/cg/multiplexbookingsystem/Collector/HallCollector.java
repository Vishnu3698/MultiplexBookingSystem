package com.cg.multiplexbookingsystem.Collector;

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

import com.cg.multiplexbookingsystem.Exception.HallNotFoundException;
import com.cg.multiplexbookingsystem.Service.IHallService;
import com.cg.multiplexbookingsystem.entity.Hall;


@RestController
@RequestMapping("/Hall")
public class HallCollector {
	@Autowired
	public IHallService hallService;
	
	@PutMapping("/insertHall")
	public Hall insertHall(@RequestBody Hall newHall) {
		return hallService.insertHall(newHall);
		
	}
	@GetMapping("/hallList")
	public List<Hall> getAllHall(){
		return hallService.getAllHall();
	}

	@GetMapping("/hallList/{id}")
		public Optional<Hall> getHall(@PathVariable ("id") Long hid){
   return hallService.getHall(hid);
	}
	@DeleteMapping("/deletehall/{id}")
	public void deleteHall(@PathVariable ("id")Long hallId) {
		hallService.deleteHall(hallId);
	}
	
	@PutMapping("/updateHall/{id}")
	public Hall updateHall(@PathVariable("id") Long hallId,@RequestBody Hall updateHall) throws HallNotFoundException {
		Optional<Hall> hall = getHall(hallId);
		Hall oldHall = hall.get();
		if(hall.isPresent()) {
			oldHall.setTotalCapacity(updateHall.getTotalCapacity());
			oldHall.setHallDesc(updateHall.getHallDesc());
			
		}else {
			throw new HallNotFoundException("hall not found with id = " +hallId);
		}
		
		return hallService.updateHall(oldHall);
	}
	}


