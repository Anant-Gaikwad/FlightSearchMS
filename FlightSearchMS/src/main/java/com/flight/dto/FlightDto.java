package com.flight.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.flight.model.Flight;
import com.flight.model.Passenger;

public class FlightDto {
	
    private int flightId;
    private String flightNumber;
    private String flightSrc;
    private String flightDest;
    private Date flightDate;
	private Double fare;
	private  int totalPassengers;
	private Set<PassengerDto> passengers;
	
	
	
	public FlightDto(Flight flight) {
		this.flightId=flight.getFlightId();
		this.flightNumber=flight.getFlightNumber();
		this.flightSrc=flight.getFlightSrc();
		this.flightDest=flight.getFlightDest();
		this.flightDate=flight.getFlightDate();
		this.fare=flight.getFare();
		
		this.passengers = new HashSet<>();
		
		for(Passenger pass: flight.getPassengers()) {
			passengers.add(new PassengerDto(pass));
		}
        this.totalPassengers = passengers.size();
	}
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightSrc() {
		return flightSrc;
	}
	public void setFlightSrc(String flightSrc) {
		this.flightSrc = flightSrc;
	}
	public String getFlightDest() {
		return flightDest;
	}
	public void setFlightDest(String flightDest) {
		this.flightDest = flightDest;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public Set<PassengerDto> getPassengers() {
		return passengers;
	}
	public void setPassengers(Set<PassengerDto> passengers) {
		this.passengers = passengers;
	}

	public int getTotalPassengers() {
		return totalPassengers;
	}

	public void setTotalPassengers(int totalPassengers) {
		this.totalPassengers = totalPassengers;
	}

}
