package com.cg.movieticketbookinhsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movieticketbookinhsystem.entity.Movies;


public interface MoviesRepository extends JpaRepository<Movies,Long>
{

}