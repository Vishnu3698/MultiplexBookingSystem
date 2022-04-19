package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;

import com.capg.multiplexbookingsystem.model.BookingDetails;


public interface BookingDetailsService {

	BookingDetails addBookingDetails(BookingDetails bookingDetails);
	//boolean transferFund(int from, int to, double amt) throws AccountException;
	List<BookingDetails> showBookingDetailss();
	void delAccount(Long bookingDetailsId);
	//Product updateAccount(Long productId);
	Optional<BookingDetails> showBookingDetailsById(Long bookingDetailsId);
}
