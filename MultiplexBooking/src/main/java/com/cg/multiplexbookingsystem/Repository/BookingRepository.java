package com.cg.multiplexbookingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.multiplexbookingsystem.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
