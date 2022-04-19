package com.capg.multiplexbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.multiplexbookingsystem.model.Movies;


public interface MoviesRepository  extends JpaRepository<Movies, Long>{

}
