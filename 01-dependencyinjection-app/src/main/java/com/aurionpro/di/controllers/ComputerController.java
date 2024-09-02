package com.aurionpro.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.di.entity.Computer;
import com.aurionpro.di.entity.Harddisk;

@RestController

//@compoent works at class level.
public class ComputerController {
//I need to return object of computer class
	//when methods are creating objects for us then we use @bean
	@Autowired
	private Computer computer;
	@Autowired
	private Harddisk harddisk;
	
	
	@GetMapping("/computers")
	private Computer getComputers() {
		return computer;
	} //i need object of Computer
	
	@GetMapping("/harddisks")
	
	private Harddisk getHarddisks() {
		return harddisk;
	}
	
	//Computer class k obkect ko controller me inject ki. Harddisk k object ko omputer object me inject kia.
	
}
