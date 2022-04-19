package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Repository;

import com.capg.multiplexbookingsystem.model.Admin;


@Repository
public interface AdminService {
	
	Admin addAdmin(Admin admin);
	//boolean transferFund(int from, int to, double amt) throws AccountException;
	List<Admin> showAdmins();
	void delAccount(Long adminId);
	//Product updateAccount(Long productId);
	Optional<Admin> showAdminById(Long adminId);

}
