package com.devs4j.di.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public ResponseEntity<String> helloWorld(){
		
		return new ResponseEntity<>("Hello Word", HttpStatus.OK);
	}
	
	
	
}
