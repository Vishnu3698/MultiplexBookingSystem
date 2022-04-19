package com.capg.multiplexbookingsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.multiplexbookingsystem.model.Admin;


public interface AdminRepository  extends JpaRepository<Admin, Long>{

}
