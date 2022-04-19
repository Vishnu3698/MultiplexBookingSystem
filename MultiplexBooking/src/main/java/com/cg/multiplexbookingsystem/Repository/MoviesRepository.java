package com.cg.multiplexbookingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.multiplexbookingsystem.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies,Long>
{

}
