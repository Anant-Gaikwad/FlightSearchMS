package com.flight.service;

import java.util.List;

import com.flight.dto.FlightDto;

public interface FlightService {
	
	public FlightDto getFlightDetails(String flightNum) throws Exception;

	public List<Object> getAllFLights() throws Exception;

}
