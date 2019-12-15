package com.flight.dto;

import com.flight.model.Passenger;

public class PassengerDto {
	
	private int passId;
    private String name;
	private int age;
	private String emailId;
		
	public PassengerDto(Passenger pass) {

		if (pass != null) {
			this.passId = pass.getPassId();
			this.name = pass.getName();
			this.age = pass.getAge();
			this.emailId = pass.getEmailId();
		}

	}
	public int getPassId() {
		return passId;
	}
	public void setPassId(int passId) {
		this.passId = passId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
