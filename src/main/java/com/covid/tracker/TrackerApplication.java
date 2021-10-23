package com.covid.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages="com.covid.tracker.jsp")

public class TrackerApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(TrackerApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);
	}

}
