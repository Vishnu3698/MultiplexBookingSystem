package com.cg.multiplexbookingsystem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="BookingInfo")
public class Booking {
	@Id
	@Column(name="BookingId")
	private long bookingId;
	private long showId;
	private Date showDate;
	private Date bookedDate;
	private long userId;
	public Booking() {
		super();
	}
	public Booking(long bookingId, long showId, Date showDate, Date bookedDate, long userId) {
		super();
		this.bookingId = bookingId;
		this.showId = showId;
		this.showDate = showDate;
		this.bookedDate = bookedDate;
		this.userId = userId;
	}
	public Booking(long bookingId, long showId, long userId) {
		super();
		this.bookingId = bookingId;
		this.showId = showId;
		this.userId = userId;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public long getShowId() {
		return showId;
	}
	public void setShowId(long showId) {
		this.showId = showId;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", showId=" + showId + ", showDate=" + showDate + ", bookedDate="
				+ bookedDate + ", userId=" + userId + "]";
	}
	}
