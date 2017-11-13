package com.spineor.countrylist.dto;

import java.util.List;

public class CountryWithCurrency {
	
	private String name;
	
	private List<Currency> currencies;
	
	public CountryWithCurrency() {
	}

	public CountryWithCurrency(String name, List<Currency> currencies) {
		this.name = name;
		this.currencies = currencies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}
	
	
}
