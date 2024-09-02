package com.aurionpro.jpacrud.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.aurionpro.jpacrud.errors.StudentErrorResponse;

@ControllerAdvice
public class ExceptionsHandler {
	
	//custom exception
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleStudentNotFoundException(StudentNotFoundException exception){
			StudentErrorResponse error=new StudentErrorResponse();
			error.setStatusCode(HttpStatus.NOT_FOUND.value());
			error.setErrorMessage(exception.getMessage());
			error.setTimestamp(System.currentTimeMillis());
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		}
		
		//predefined exception
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleStudentException(MethodArgumentTypeMismatchException exception){
			StudentErrorResponse error=new StudentErrorResponse();
			
			error.setStatusCode(HttpStatus.BAD_REQUEST.value());
			error.setErrorMessage("Roll Number has to be integer");
			error.setTimestamp(System.currentTimeMillis());
			
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		}
		
//		@ExceptionHandler
//		public ResponseEntity<StudentErrorResponse> handleStudentException(MethodArgumentNotValidException exception){
//			StudentErrorResponse error=new StudentErrorResponse();
//			
//			error.setStatusCode(HttpStatus.BAD_REQUEST.value());
//			error.setErrorMessage("something went wrong");
//			error.setTimestamp(System.currentTimeMillis());
//			
//			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
//		}
//		
		@ExceptionHandler
		public ResponseEntity<?> handleStudentException(MethodArgumentNotValidException exception){
			Map<String,String> errors=new HashMap();
			exception.getBindingResult().getFieldErrors().forEach((error)->{
				errors.put(error.getField(), error.getDefaultMessage());
			});
			
			return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
			
		}

}
