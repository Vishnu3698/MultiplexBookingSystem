package com.capgemini.productmanagementapp.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.productmanagementapp.model.Seller;



public interface SellerService {
	Seller addSeller(Seller seller);
	//boolean transferFund(int from, int to, double amt) throws AccountException;
	List<Seller> showSeller();
	void delAccount(Long sellerId);
	//Product updateAccount(Long productId);
	Optional<Seller> showSellerById(Long sellerId);

}
