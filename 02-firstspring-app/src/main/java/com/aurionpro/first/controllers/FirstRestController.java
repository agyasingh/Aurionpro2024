package com.aurionpro.first.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//marking class as a controller.It will convertit into a servlet internally. 

public class FirstRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello! Welome to Spring Boot Aagya";
	}
	
	@GetMapping("/bye")
	public String Bye() {
		return "bye! Welome to Spring Boot Aagya";
	}
	

}
