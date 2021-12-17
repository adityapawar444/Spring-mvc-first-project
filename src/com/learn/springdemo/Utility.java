package com.learn.springdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Utility {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	public Utility() {

	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

}
