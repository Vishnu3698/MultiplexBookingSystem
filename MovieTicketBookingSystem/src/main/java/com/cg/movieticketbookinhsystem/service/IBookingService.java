package com.cg.movieticketbookinhsystem.service;

import java.util.List;
import java.util.Optional;

import com.cg.movieticketbookinhsystem.entity.Booking;



public interface IBookingService {

	Booking insertBooking(Booking newBooking);

	List<Booking> getAllBooking();

	Optional<Booking> getBooking(Long bid);

	void cancleBooking(Long bkId);

	Booking updateBooking(Booking oldBooking);

	
}
