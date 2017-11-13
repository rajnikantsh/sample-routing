package com.spineor.countrylist.controller;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spineor.countrylist.dto.CountryWithCurrency;

@RestController
@RequestMapping("/")
public class CountryController {
	
	private final RestTemplate restTemplate;

	public CountryController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@RequestMapping("/countries")
	public Collection<CountryWithCurrency> getCountries(){
		ParameterizedTypeReference<List<CountryWithCurrency>> ptr = new ParameterizedTypeReference<List<CountryWithCurrency>>() {
        };
ResponseEntity<List<CountryWithCurrency>> responseEntity = this.restTemplate.exchange("https://restcountries.eu/rest/v2/all", HttpMethod.GET,
      null, ptr);

return responseEntity
      .getBody()     
      .stream()
      .collect(Collectors.toList());
	}

}
