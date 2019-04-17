package com.felipe.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.api.security.user.User;

@RestController
@RequestMapping("api/v1/hello")
public class Hello {

	@Autowired
	private User user;
	
	@GetMapping
	public String sayHello() {
		return String.format("Hello %s :)", user.getUsername());
	}

	
	@ExceptionHandler(Exception.class)
	public String handleError(Exception e) {
		e.printStackTrace();
		return "An error ocurred while processing the request. Please try again later.";
	}
}
