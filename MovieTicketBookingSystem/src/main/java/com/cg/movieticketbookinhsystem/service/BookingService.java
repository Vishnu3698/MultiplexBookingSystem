package com.cg.movieticketbookinhsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.movieticketbookinhsystem.entity.Booking;
import com.cg.movieticketbookinhsystem.repository.BookingRepository;


@Service
public class BookingService implements IBookingService {

	@Autowired
	public BookingRepository bookingRepository;

	@Override
	public Booking insertBooking(Booking newBooking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(newBooking);
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return  bookingRepository.findAll();
	}

	@Override
	public Optional<Booking> getBooking(Long bid) {
		// TODO Auto-generated method stub
		return  bookingRepository.findById(bid);
	}

	@Override
	public void cancleBooking(Long bkId) {
		 bookingRepository.deleteById(bkId);
		
	}

	@Override
	public Booking updateBooking(Booking oldBooking) {
		// TODO Auto-generated method stub
		return  bookingRepository.save(oldBooking);
	}

	
	
}
