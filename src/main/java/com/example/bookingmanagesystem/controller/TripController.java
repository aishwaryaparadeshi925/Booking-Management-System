package com.example.bookingmanagesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookingmanagesystem.entity.Trip;
import com.example.bookingmanagesystem.service.TripService;

import jakarta.validation.Valid;

@Controller
@RestController
@RequestMapping("/trips")
public class TripController {
	
	
	@Autowired
	TripService tripserService;
	
	@PostMapping
	public String insertData(@Valid @RequestBody Trip trip) {
		tripserService.insert(trip);
		return "Data inserted";
	}
	
	@GetMapping("/{id}")
	public Trip FindById(@PathVariable int id) {
		return tripserService.findById(id);
	}
   


}
