package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.capg.multiplexbookingsystem.model.User;

@Repository
public interface UserService extends JpaRepository<User, Long>{
	Optional<User> findByNameAndEmail(String name, String email);
	
	Optional<User> findByNameAndUserType(String name, String userType);
	
	
	User addUser(User user);
	//boolean transferFund(int from, int to, double amt) throws AccountException;
	List<User> showUsers();
	void delAccount(Long userId);
	//Product updateAccount(Long productId);
	Optional<User> showUserById(Long userId);

	
	


}
