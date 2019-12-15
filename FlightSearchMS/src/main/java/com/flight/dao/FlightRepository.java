package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>  {

	Flight findByFlightNumber(String flightNum);
	
	

}
