package com.capg.multiplexbookingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingId")
	private Long bookingId;
	
	@Column(name = "bookingDate", nullable = false)
	private String bookingDate;
	
	@Column(name = "amount", nullable = false)
	private double amount;
	
	@Column(name = "bookingTime", nullable = false)
	private  String bookingTime;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(Long bookingId, String bookingDate, double amount, String bookingTime) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.amount = amount;
		this.bookingTime = bookingTime;
	}

	public Booking(String bookingDate, double amount, String bookingTime) {
		super();
		this.bookingDate = bookingDate;
		this.amount = amount;
		this.bookingTime = bookingTime;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", amount=" + amount
				+ ", bookingTime=" + bookingTime + "]";
	}
	
}
