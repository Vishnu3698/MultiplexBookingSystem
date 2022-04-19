package com.capg.multiplexbookingsystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookingdetails")
public class BookingDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingDetailsId;
	
	@Column(name = "name", nullable = false)
	private String noOfSeats;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "bookingId")
	private Booking booking;
	
	public BookingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookingDetails(Long bookingDetailsId, String noOfSeats, Booking booking) {
		super();
		this.bookingDetailsId = bookingDetailsId;
		this.noOfSeats = noOfSeats;
		this.booking = booking;
	}

	public BookingDetails(String noOfSeats, Booking booking) {
		super();
		this.noOfSeats = noOfSeats;
		this.booking = booking;
	}

	public Long getBookingDetailsId() {
		return bookingDetailsId;
	}

	public void setBookingDetailsId(Long bookingDetailsId) {
		this.bookingDetailsId = bookingDetailsId;
	}

	public String getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingDetailsId=" + bookingDetailsId + ", noOfSeats=" + noOfSeats + ", booking="
				+ booking + "]";
	}
	
}
