package com.example.demo.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalexceptionHandler {
    
	@ExceptionHandler(ProjectException.class)
	public ResponseEntity<MyErrorDetails> productExceptionHandler(ProjectException pe, WebRequest req){
		
		MyErrorDetails error = new MyErrorDetails(LocalDate.now(), pe.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception ee, WebRequest req){
		
		MyErrorDetails error = new MyErrorDetails(LocalDate.now(), ee.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(error, HttpStatus.BAD_REQUEST);
	}
	
}
