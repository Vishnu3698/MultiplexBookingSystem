package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.multiplexbookingsystem.dao.BookingRepository;
import com.capg.multiplexbookingsystem.model.Booking;



@Service
@Transactional
public class BookingServiceImpl implements BookingService{
	@Autowired
	BookingRepository bookingRepo;

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepo.save(booking);
	}

	@Override
	public List<Booking> showBookings() {
		// TODO Auto-generated method stub
		return bookingRepo.findAll();
	}

	@Override
	public void delAccount(Long bookingId) {
		// TODO Auto-generated method stub
		bookingRepo.deleteById(bookingId);
	}

	/*
	 * @Override public Product updateAccount(Long productId) { // TODO
	 * Auto-generated method stub
	 * 
	 * Optional<Product> product = productRepo.findById(productId);
	 * 
	 * }
	 */

	@Override
	public Optional<Booking> showBookingById(Long bookingId) {
		// TODO Auto-generated method stub
		return bookingRepo.findById(bookingId);
	}
	

}
