package com.capgemini.productmanagementapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.capgemini.productmanagementapp.dao.ProductRepository;
import com.capgemini.productmanagementapp.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepo;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Product> showProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public void delAccount(Long productId) {
		// TODO Auto-generated method stub
		 productRepo.deleteById(productId);
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
	public Optional<Product> showProductById(Long productId) {
		// TODO Auto-generated method stub
		return productRepo.findById(productId);
	}
	


}
