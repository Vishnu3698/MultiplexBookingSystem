package com.cg.multiplexbookingsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.multiplexbookingsystem.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
