package com.cg.multiplexbookingsystem.Service;

import java.util.List;
import java.util.Optional;

import com.cg.multiplexbookingsystem.entity.Booking;

public interface IBookingService {

	Booking insertBooking(Booking newBooking);

	List<Booking> getAllBooking();

	Optional<Booking> getBooking(Long bid);

	void cancleBooking(Long bkId);

	Booking updateBooking(Booking oldBooking);

	
}
