package com.capgemini.productmanagementapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.productmanagementapp.model.Seller;



public interface SellerRepository extends JpaRepository<Seller, Long> {
	

}
