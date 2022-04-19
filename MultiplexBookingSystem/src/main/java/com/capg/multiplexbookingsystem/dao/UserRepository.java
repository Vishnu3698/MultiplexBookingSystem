package com.capg.multiplexbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.multiplexbookingsystem.model.User;


public interface UserRepository  extends JpaRepository<User, Long>{

}
