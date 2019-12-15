package com.flight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.FlightDto;
import com.flight.response.FlightResponse;
import com.flight.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	
	@Autowired
	private FlightService service;

	
	@GetMapping(value= "/getFlight")
	public FlightResponse getFlightDetails(@RequestParam(value = "flightNo") String flightNum) {

		FlightResponse res = new FlightResponse();
		try {

			List<Object> list = new ArrayList<>();
			
			FlightDto dto = service.getFlightDetails(flightNum);
			
			list.add(dto);
			
			res.setResult(list);
			res.setStatusCode(HttpStatus.OK.toString());
			res.setMessage("SUCCESS");

		} catch (NullPointerException e) {
			res.setStatusCode(HttpStatus.NOT_FOUND.toString());
			res.setMessage(e.getMessage());
		} catch (Exception e) {
			res.setMessage(e.getMessage());
			res.setStatusCode(HttpStatus.EXPECTATION_FAILED.toString());
		}

		return res;
	}
	
	@GetMapping(value= "/getAllFlight")
	public FlightResponse getAllFlightDetails() {
		
		FlightResponse res = new FlightResponse();
		try {

			List<Object> flightlist = service.getAllFLights();

			res.setMessage("SUCCESS");
			res.setStatusCode(HttpStatus.OK.toString());
			res.setResult(flightlist);

		} catch (NullPointerException e) {
			res.setStatusCode(HttpStatus.NOT_FOUND.toString());
			res.setMessage(e.getMessage());
		} catch (Exception e) {
			res.setMessage(e.getMessage());
			res.setStatusCode(HttpStatus.EXPECTATION_FAILED.toString());
		}
		return res;
	}
}
