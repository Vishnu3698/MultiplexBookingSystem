package com.capg.multiplexbookingsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.multiplexbookingsystem.dao.BookingRepository;
import com.capg.multiplexbookingsystem.exception.BookingException;
import com.capg.multiplexbookingsystem.model.Booking;
import com.capg.multiplexbookingsystem.service.BookingService;


@CrossOrigin(origins = "*")
@RequestMapping("/api/v2")
@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private BookingRepository bookingRepository;

	@PutMapping("/bookings/{id}")
	public ResponseEntity<Booking> updateEmployee(@PathVariable(value = "id") Long bookingId,
			@RequestBody Booking bookingDetails) throws BookingException {
		Booking booking = bookingRepository.findById(bookingId)
				.orElseThrow(() -> new BookingException("Booking not found for this id :: " + bookingId));

		booking.setBookingDate(bookingDetails.getBookingDate());
		booking.setAmount(bookingDetails.getAmount());
		booking.setBookingTime(bookingDetails.getBookingTime());
		
		final Booking updatedBooking = bookingRepository.save(booking);
		return ResponseEntity.ok(updatedBooking);
	}

	@DeleteMapping("/bookings/{bookingId}")
	public ResponseEntity<String> delBookings(@PathVariable("bookingId") Long bookingId) {
		System.out.println("Acc ID:"+bookingId);
		try {
			bookingService.delAccount(bookingId);
		} catch (Exception ex) {
			throw new BookingException(ex.getMessage());
		}
		return new ResponseEntity<String>("Booking Deleted.", HttpStatus.OK);
	}


	@GetMapping("/bookings")
	public ResponseEntity<List<Booking>> getBookings() {
		List<Booking> bookingList = bookingService.showBookings();
		return new ResponseEntity<List<Booking>>(bookingList, HttpStatus.OK);
	}

	
	@GetMapping("/bookings/{bookingId}")
	public ResponseEntity<Optional<Booking>> getBookingById(@PathVariable("bookingId") Long bookingId) {
		Optional<Booking>booking = bookingService.showBookingById(bookingId);
	return new ResponseEntity<Optional<Booking>>(booking, HttpStatus.OK);
}

	@PostMapping("/bookings")
	public Booking createBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}

}
