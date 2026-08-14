package com.example.bookingmanagesystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookingmanagesystem.entity.Trip;
import com.example.bookingmanagesystem.exception.TripNotFoundException;
import com.example.bookingmanagesystem.repository.TripRepository;

@Service
public class TripService {
	
	@Autowired
	TripRepository triprepository;
	
	public String insert(Trip trip) {
		triprepository.save(trip);
		return "Data inserted";
	}
	
	
	public Trip findById(int id) {
		return triprepository.findById(id).orElseThrow(()->new TripNotFoundException("Trip not found"));
	}


}
