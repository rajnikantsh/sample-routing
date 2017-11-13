package com.spineor.countrylist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CountrylistApplication extends SpringBootServletInitializer {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CountrylistApplication.class);
    }
	 
	public static void main(String[] args) {
		SpringApplication.run(CountrylistApplication.class, args);
	}
}
