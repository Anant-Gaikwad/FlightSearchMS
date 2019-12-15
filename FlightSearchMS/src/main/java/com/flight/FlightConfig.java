package com.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.flight.filters.RequestResponseFilter;
import com.flight.interceptors.FlightServiceInterceptor;

@Configuration
public class FlightConfig extends WebMvcConfigurationSupport {

	@Autowired
	private FlightServiceInterceptor interceptor;
	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		System.out.println("inside addInterceptors");
		registry.addInterceptor(interceptor).addPathPatterns("/flight/getFlight");
	}

	@Bean
	public FilterRegistrationBean<RequestResponseFilter> flightFilter() {

		System.out.println("Register Filter");
		FilterRegistrationBean<RequestResponseFilter> filter = new FilterRegistrationBean<>();
		filter.setFilter(new RequestResponseFilter());
		filter.addUrlPatterns("/flight/*");
		return filter;
	}

}
