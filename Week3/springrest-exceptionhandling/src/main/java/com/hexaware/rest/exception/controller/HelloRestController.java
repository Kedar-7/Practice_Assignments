package com.hexaware.rest.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
	
	@GetMapping("/div/{num1}/{num2}")
	public String divNumbers(@PathVariable int num1, @PathVariable int num2) {
		int result = num1/num2;
		return "Div of num is : "+ result;
	}
	/*
	@ResponseStatus(value=HttpStatus.EXPECTATION_FAILED, 
			reason="Sorry You can't divide number by 0")
	@ExceptionHandler({ArithmeticException.class})
	public void exceptionHandler() {
		System.out.println("Exception Handled");
	}
	*/
	
	/*
	@ExceptionHandler({ArithmeticException.class
	public ResponseEntity<String> exceptionHandler() {
		System.out.println("Exception Handled");
		return new ResponseEntity<String>("Sorry You can't divide number by 0", HttpStatus.BAD_REQUEST);
	}
	*/
		
}


