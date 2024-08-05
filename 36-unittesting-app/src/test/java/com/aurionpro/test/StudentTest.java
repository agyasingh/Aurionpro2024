package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.aurionpro.model.IStudentService;
import com.aurionpro.model.Student;

class StudentTest {
	
	private IStudentService studentservice;
	private Student student;
	
	@BeforeEach
	void init(){
		studentservice = Mockito.mock(IStudentService.class);
		// Initialize the student object with the mocked studentservice
		student = new Student(studentservice);
	}
	
	@AfterEach
	void status() {
		System.out.println("testCalculatePercentage executed");
	}
	
	@Test
	void testCalculatePercentage() {
		Mockito.when(studentservice.getMarks()).thenReturn(650);
		Mockito.when(studentservice.getNumberOfSubjects()).thenReturn(10);
		
		assertEquals(65.0, student.calculatePercentage());
	}

}
