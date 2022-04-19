package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Repository;


import com.capg.multiplexbookingsystem.model.Booking;
@Repository
public interface BookingService  {
	Booking addBooking(Booking  booking );
	//boolean transferFund(int from, int to, double amt) throws AccountException;
	List<Booking > showBookings();
	void delAccount(Long bookingId);
	//Product updateAccount(Long productId);
	Optional<Booking > showBookingById(Long bookingId);

	
}
