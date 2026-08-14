package com.example.bookingmanagesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookingmanagesystem.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer>{

}
