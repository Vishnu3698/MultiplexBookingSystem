package com.cg.movieticketbookinhsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movieticketbookinhsystem.entity.Booking;



public interface BookingRepository extends JpaRepository<Booking,Long> {

}
