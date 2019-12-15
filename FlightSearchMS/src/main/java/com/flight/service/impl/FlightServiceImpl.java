package com.flight.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.FlightRepository;
import com.flight.dto.FlightDto;
import com.flight.model.Flight;
import com.flight.service.FlightService;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {
	
 
	@Autowired
	private FlightRepository repo;

	@Override
	public FlightDto getFlightDetails(String flightNum) throws Exception {

		Flight flight = repo.findByFlightNumber(flightNum);
		
		if (flight == null) {
			throw new NullPointerException("Flight Numer : "+ flightNum +" is not Found");
		}

		return new FlightDto(flight);
	}

	@Override
	public List<Object> getAllFLights() throws Exception {

		List<Object> list = new ArrayList<>();
		
		List<Flight> flightList = repo.findAll();
		
		for (Flight flight : flightList) {
			list.add(new FlightDto(flight));
		}
		
		if(list.isEmpty()) {
			throw new NullPointerException("Flights are not present");
		}
		
		return list;
	}

}
