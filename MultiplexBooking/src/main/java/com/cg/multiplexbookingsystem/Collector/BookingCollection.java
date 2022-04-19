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

import com.cg.multiplexbookingsystem.Exception.BookingNotFoundException;
import com.cg.multiplexbookingsystem.Service.IBookingService;
import com.cg.multiplexbookingsystem.entity.Booking;


@RestController
@RequestMapping("/Booking")
public class BookingCollection {
	
   @Autowired
	public IBookingService bookingService;
	
	@PutMapping("/insertUser")
	public Booking  insertBooking(@RequestBody Booking newBooking) {
		return bookingService.insertBooking(newBooking);
		
	}
	
	@GetMapping("/bookingList")
	public List<Booking> getAllBooking(){
		return bookingService.getAllBooking();
	}
	@GetMapping("/bookingList/{id}")
	public Optional<Booking> getBooking(@PathVariable ("id") Long bid){
return bookingService.getBooking(bid);
}
	@DeleteMapping("/cancleBooking/{id}")
	public void cancleBooking(@PathVariable ("id")Long bkId) {
		bookingService.cancleBooking(bkId);
	}
	@PutMapping("/updateBooking/{id}")
	public Booking updateBooking(@PathVariable("id") Long bkId,@RequestBody Booking updateBooking) throws BookingNotFoundException {
		Optional<Booking> book = getBooking(bkId);
		Booking oldBooking = book.get();
		if(book.isPresent()) {
			oldBooking.setBookedDate(updateBooking.getBookedDate());
			oldBooking.setShowDate(updateBooking.getShowDate());
			
		}else {
			throw new BookingNotFoundException("Booking not found with id = " +bkId);
		}
		
		return bookingService.updateBooking(oldBooking);
	}
	}


