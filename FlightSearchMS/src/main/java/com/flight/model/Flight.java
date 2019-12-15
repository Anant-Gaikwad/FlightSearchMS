package com.flight.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "flight")
public class Flight {

	@GeneratedValue(strategy = IDENTITY)
	@Id
	@Column(name="flightid")
	private int flightId;
	
	@Column(name = "flightNumber", length = 100)
    private String flightNumber;
	
	@Column
    private String flightSrc;
	
	@Column
    private String flightDest;
	
	@Column
    private Date flightDate;
	
	@Column
    private Double fare;
	
	@OneToMany
	private Set<Passenger> passengers;

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

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}
    
    
 
    
}
