package com.flight.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.HttpResource;

@Component
public class RequestResponseFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(RequestResponseFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		logger.info("Request LOGGER : URI="+ req.getRequestURI());
		
		chain.doFilter(request, response);
		
		logger.info("Response LOGGER : STATUS="+ res.getStatus());
		
	}

}
