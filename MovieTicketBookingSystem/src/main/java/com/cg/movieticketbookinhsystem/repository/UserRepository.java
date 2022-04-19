package com.cg.movieticketbookinhsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movieticketbookinhsystem.entity.User;



public interface UserRepository extends JpaRepository<User,Long>{

}

