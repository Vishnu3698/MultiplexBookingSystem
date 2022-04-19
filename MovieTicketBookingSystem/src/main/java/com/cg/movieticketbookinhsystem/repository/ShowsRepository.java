package com.cg.movieticketbookinhsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movieticketbookinhsystem.entity.Shows;





public interface ShowsRepository extends JpaRepository<Shows,Long> 
{

}