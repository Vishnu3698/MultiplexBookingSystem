package com.capgemini.productmanagementapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.productmanagementapp.dao.SellerRepository;
import com.capgemini.productmanagementapp.model.Seller;

@Service
@Transactional


public class SellerServicelmpl implements SellerService{
	@Autowired
	SellerRepository sellerRepo;

	public Seller addSeller(Seller seller) {
		// TODO Auto-generated method stub
		return sellerRepo.save(seller);
	}

	public List<Seller> showSeller() {
		// TODO Auto-generated method stub
		return sellerRepo.findAll();
	}

	public void delAccount(Long sellerId) {
		// TODO Auto-generated method stub
		 sellerRepo.deleteById(sellerId);
	}

	/*
	 * @Override public Product updateAccount(Long productId) { // TODO
	 * Auto-generated method stub
	 * 
	 * Optional<Product> product = productRepo.findById(productId);
	 * 
	 * }
	 */

	public Optional<Seller> showSellerById(Long sellerId) {
		// TODO Auto-generated method stub
		return sellerRepo.findById(sellerId);
	}
	


}


