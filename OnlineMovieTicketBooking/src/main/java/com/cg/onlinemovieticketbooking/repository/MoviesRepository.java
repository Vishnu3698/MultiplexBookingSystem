package com.cg.onlinemovieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlinemovieticketbooking.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Long> {

}
