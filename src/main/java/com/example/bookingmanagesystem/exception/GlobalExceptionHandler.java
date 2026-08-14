package com.example.bookingmanagesystem.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(exception = TripNotFoundException.class)
public ResponseEntity<Map<String,Object>> tripNotFoundExceptionHandle(TripNotFoundException ex){
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("timestamp",LocalDateTime.now());
		map.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
		map.put("Message",ex.getMessage());
	return new ResponseEntity<Map<String,Object>>(map, HttpStatus.INTERNAL_SERVER_ERROR);
	
}
	

}
