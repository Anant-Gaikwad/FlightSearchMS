package com.flight.response;

import java.util.List;

/**
 * @author Andy
 *
 */
public class FlightResponse {
	
	private String message;
	private String statusCode;
	private transient List<Object> result;
	
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public List<Object> getResult() {
		return result;
	}
	public void setResult(List<Object> result) {
		this.result = result;
	}
	
	
	
	

}
