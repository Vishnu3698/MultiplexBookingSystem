package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.multiplexbookingsystem.dao.BookingDetailsRepository;
import com.capg.multiplexbookingsystem.model.BookingDetails;



@Service
@Transactional
public class BookingDetailsImpl implements BookingDetailsService{
	
	@Autowired
	BookingDetailsRepository bookingDetailsRepo;

	@Override
	public BookingDetails addBookingDetails(BookingDetails bookingDetails) {
		// TODO Auto-generated method stub
		return bookingDetailsRepo.save(bookingDetails);
	}

	@Override
	public List<BookingDetails> showBookingDetailss() {
		// TODO Auto-generated method stub
		return bookingDetailsRepo.findAll();
	}

	@Override
	public void delAccount(Long bookingDetailsId) {
		// TODO Auto-generated method stub
		bookingDetailsRepo.deleteById(bookingDetailsId);
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
	public Optional<BookingDetails> showBookingDetailsById(Long bookingDetailsId) {
		// TODO Auto-generated method stub
		return bookingDetailsRepo.findById(bookingDetailsId);
	}

}
