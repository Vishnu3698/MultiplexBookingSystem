package com.capgemini.productmanagementapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.productmanagementapp.dao.SellerRepository;
import com.capgemini.productmanagementapp.exception.SellerException;
import com.capgemini.productmanagementapp.model.Seller;
import com.capgemini.productmanagementapp.service.SellerService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v2")
@RestController
public class SellerController {
	@Autowired
	private SellerService sellerService;
	
	@Autowired
	private SellerRepository sellerRepository;

	@PutMapping("/seller/{id}")
	public ResponseEntity<Seller> updateEmployee(@PathVariable(value = "id") Long sellerId,
			@RequestBody Seller sellerDetails) throws SellerException {
		Seller seller = sellerRepository.findById(sellerId)
				.orElseThrow(() -> new SellerException("Seller not found for this id :: " + sellerId));

		seller.setName(sellerDetails.getName());
		seller.setEmailid(sellerDetails.getEmailid());
		seller.setPassword(sellerDetails.getPassword());
		seller.setId(sellerDetails.getId());
		seller.setLocation(sellerDetails.getLocation());
		final Seller updatedSeller = sellerRepository.save(seller);
		return ResponseEntity.ok(updatedSeller);
	}

	@DeleteMapping("/seller/{sellerId}")
	public ResponseEntity<String> delSeller(@PathVariable("sellerId") Long sellerId) {
		System.out.println("Acc ID:"+sellerId);
		try {
			sellerService.delAccount(sellerId);
		} catch (Exception ex) {
			throw new SellerException(ex.getMessage());
		}
		return new ResponseEntity<String>("Seller Deleted.", HttpStatus.OK);
	}


	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getSeller() {
		List<Seller> sellerList = sellerService.showSeller();
		return new ResponseEntity<List<Seller>>(sellerList, HttpStatus.OK);
	}

	
	@GetMapping("/seller/{sellerId}")
	public ResponseEntity<Optional<Seller>> getSellerById(@PathVariable("sellerId") Long sellerId) {
		Optional<Seller> seller = sellerService.showSellerById(sellerId);
	return new ResponseEntity<Optional<Seller>>(seller, HttpStatus.OK);
}

	@PostMapping("/seller")
	public Seller createSeller(@RequestBody Seller seller) {
		return sellerService.addSeller(seller);
	}
	/*
	 * @PostMapping("/products") public ResponseEntity<String>
	 * addAccount(@RequestBody Product product, BindingResult br) throws
	 * ProductException { String err = ""; if (br.hasErrors()) { List<FieldError>
	 * errors = br.getFieldErrors(); for (FieldError error : errors) err +=
	 * error.getDefaultMessage() + "<br/>"; throw new ProductException(err); } try {
	 * productService.addProduct(product); return new
	 * ResponseEntity<String>("Product added", HttpStatus.OK);
	 * 
	 * } catch (DataIntegrityViolationException ex) { throw new
	 * ProductException("ID already exists"); } }
	 */



}
