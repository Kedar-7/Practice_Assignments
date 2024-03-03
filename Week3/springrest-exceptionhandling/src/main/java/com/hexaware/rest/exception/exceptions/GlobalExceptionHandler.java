package com.hexaware.rest.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	/*
	@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE, reason="Some Exception occured")
	@ExceptionHandler({ArithmeticException.class})
	public void handleExp() {
		
	}
	*/
	
	//@ResponseStatus(value=HttpStatus.NOT_ACCEPTABLE, reason="Some Exception occured")
	@ExceptionHandler({ArithmeticException.class})
	public ResponseEntity<String> handleExp(ArithmeticException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
