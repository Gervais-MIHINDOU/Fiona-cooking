package com.fionaentreprise.Fiona_Cooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FionaCookingApplication  extends SpringBootServletInitializer{
	
	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(FionaCookingApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(FionaCookingApplication.class, args);
	}
}