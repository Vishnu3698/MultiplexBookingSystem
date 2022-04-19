package com.capg.multiplexbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.multiplexbookingsystem.model.Booking;


public interface BookingRepository  extends JpaRepository<Booking, Long> {

}
