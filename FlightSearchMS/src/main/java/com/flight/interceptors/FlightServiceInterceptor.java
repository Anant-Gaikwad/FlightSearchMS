package com.flight.interceptors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class FlightServiceInterceptor implements HandlerInterceptor{

	@Value("${flightNumber.pattern}")
	private String flightNumPattern;
	
	@Override
	 public boolean preHandle(HttpServletRequest request,   HttpServletResponse response, 
			Object handler) throws Exception {

		if (!StringUtils.isEmpty(request.getParameter("flightNo"))) {
			String fno = request.getParameter("flightNo");
			Pattern pattern = Pattern.compile(flightNumPattern);
			Matcher matcher = pattern.matcher(fno);
			if (!matcher.matches()) {
				// response.setStatus(HttpStatus.OK.value(), "");
				response.sendError(HttpStatus.OK.value(),
						"Invalid Flight Number. Please follow pattern :  " + flightNumPattern);
				return false;
			}
		}
		return true;
	}
}
