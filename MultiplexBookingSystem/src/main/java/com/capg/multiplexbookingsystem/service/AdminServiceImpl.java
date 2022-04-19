package com.capg.multiplexbookingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.multiplexbookingsystem.dao.AdminRepository;
import com.capg.multiplexbookingsystem.model.Admin;




@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminRepository adminRepo;

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public List<Admin> showAdmins() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

	@Override
	public void delAccount(Long adminId) {
		// TODO Auto-generated method stub
		adminRepo.deleteById(adminId);
	}

	/*
	 * @Override public Product updateAccount(Long productId) { // TODO
	 * Auto-generated method stub
	 * 
	 * Optional<Product> product = productRepo.findById(productId);
	 * 
	 * }
	 */

	@Override
	public Optional<Admin>showAdminById(Long adminId) {
		// TODO Auto-generated method stub
		return adminRepo.findById(adminId);
	}

	}
