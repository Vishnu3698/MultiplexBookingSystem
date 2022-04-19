package com.capgemini.productmanagementapp.controller;

import java.util.List;
import java.util.Optional;



//import javax.validation.Valid;

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
import com.capgemini.productmanagementapp.dao.ProductRepository;
import com.capgemini.productmanagementapp.exception.ProductException;
import com.capgemini.productmanagementapp.model.Product;
import com.capgemini.productmanagementapp.service.ProductService;



@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepository productRepository;

	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateEmployee(@PathVariable(value = "id") Long productId,
			@RequestBody Product productDetails) throws ProductException {
		Product product = productRepository.findById(productId)
				.orElseThrow(() -> new ProductException("Product not found for this id :: " + productId));

		product.setTitle(productDetails.getTitle());
		product.setWeight(productDetails.getWeight());
		product.setCategory(productDetails.getCategory());
		product.setBrand(productDetails.getBrand());
		product.setPrice(productDetails.getPrice());
		final Product updatedProduct = productRepository.save(product);
		return ResponseEntity.ok(updatedProduct);
	}

	@DeleteMapping("/products/{productId}")
	public ResponseEntity<String> delProducts(@PathVariable("productId") Long productId) {
		System.out.println("Acc ID:"+productId);
		try {
			productService.delAccount(productId);
		} catch (Exception ex) {
			throw new ProductException(ex.getMessage());
		}
		return new ResponseEntity<String>("Product Deleted.", HttpStatus.OK);
	}


	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> productList = productService.showProducts();
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}

	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Optional<Product>> getProductById(@PathVariable("productId") Long productId) {
		Optional<Product> product = productService.showProductById(productId);
	return new ResponseEntity<Optional<Product>>(product, HttpStatus.OK);
}

	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		return productService.addProduct(product);
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
