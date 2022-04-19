package com.capgemini.productmanagementapp.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.productmanagementapp.exception.SellerException;

@RestControllerAdvice

public class SellerAdvice extends Exception {
	@ExceptionHandler(value = { SellerException.class })
	public ResponseEntity<String> handleException1(Exception ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}


