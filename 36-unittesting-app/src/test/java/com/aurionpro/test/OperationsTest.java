package com.aurionpro.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.aurionpro.model.Operations;




class OperationsTest {
	@AfterEach
	void status() {
		System.out.println("Test executed");
	}
 Operations operations = new Operations();
 @Test
 void testAddition() {//  int actual = operations.addition(5, 5);
//  int expected = 10;  // Function to test whether the acutal and expected are matching or not if
  // matching test case will pass otherwise it will fail//  assertEquals(expected, actual);
  assertEquals(10, operations.addition(5, 5), "This function "
  		+ "must do addition");
 }}
 


//	BeforeEach--new object for every method
//BeforeAll--one object shared by all
//tdd
//test case made first
//assertEquals(actual,expected)
//classes made after that
