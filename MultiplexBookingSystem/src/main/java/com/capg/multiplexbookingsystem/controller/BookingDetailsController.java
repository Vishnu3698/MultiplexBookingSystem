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

import com.capg.multiplexbookingsystem.dao.BookingDetailsRepository;
import com.capg.multiplexbookingsystem.exception.BookingDetailsException;
import com.capg.multiplexbookingsystem.model.BookingDetails;
import com.capg.multiplexbookingsystem.service.BookingDetailsService;



@CrossOrigin(origins = "*")
@RequestMapping("/api/v3")
@RestController
public class BookingDetailsController {
	
	@Autowired
	private BookingDetailsService bookingDetailsService;
	
	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;

	@PutMapping("/bookingDetailss/{id}")
	public ResponseEntity<BookingDetails> updateEmployee(@PathVariable(value = "id") Long bookingDetailsId,
			@RequestBody BookingDetails bookingDetailsDetails) throws BookingDetailsException {
		BookingDetails bookingDetails = bookingDetailsRepository.findById(bookingDetailsId)
				.orElseThrow(() -> new BookingDetailsException("BookingDetails not found for this id :: " + bookingDetailsId));

		bookingDetails.setNoOfSeats(bookingDetailsDetails.getNoOfSeats());
		bookingDetails.setBooking(bookingDetails.getBooking());
		
		final BookingDetails updatedBookingDetails = bookingDetailsRepository.save(bookingDetails);
		return ResponseEntity.ok(updatedBookingDetails);
	}

	@DeleteMapping("/bookingDetailss/{bookingDetailsId}")
	public ResponseEntity<String> delBookingDetailss(@PathVariable("bookingDetailsId") Long bookingDetailsId) {
		System.out.println("Acc ID:"+bookingDetailsId);
		try {
			bookingDetailsService.delAccount(bookingDetailsId);
		} catch (Exception ex) {
			throw new BookingDetailsException(ex.getMessage());
		}
		return new ResponseEntity<String>("BookingDetails Deleted.", HttpStatus.OK);
	}


	@GetMapping("/bookingDetailss")
	public ResponseEntity<List<BookingDetails>> getBookingDetailss() {
		List<BookingDetails> bookingDetailsList = bookingDetailsService.showBookingDetailss();
		return new ResponseEntity<List<BookingDetails>>(bookingDetailsList, HttpStatus.OK);
	}

	
	@GetMapping("/bookingDetailss/{bookingDetailsId}")
	public ResponseEntity<Optional<BookingDetails>> getBookingDetailsById(@PathVariable("bookingDetailsId") Long bookingDetailsId) {
		Optional<BookingDetails> bookingDetails = bookingDetailsService.showBookingDetailsById(bookingDetailsId);
	return new ResponseEntity<Optional<BookingDetails>>(bookingDetails, HttpStatus.OK);
}

	@PostMapping("/bookingDetailss")
	public BookingDetails createBookingDetails(@RequestBody BookingDetails bookingDetails) {
		return bookingDetailsService.addBookingDetails(bookingDetails);
	}

}
