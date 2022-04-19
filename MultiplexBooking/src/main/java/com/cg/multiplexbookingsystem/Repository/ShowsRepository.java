package com.cg.multiplexbookingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.multiplexbookingsystem.entity.Shows;



public interface ShowsRepository extends JpaRepository<Shows,Long> 
{

}
