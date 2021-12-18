package com.learn.springdemo;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="Enter a valid input")
	@Size(min=1,message="Enter a valid input")
	private String lastName;
	
	public Customer() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	

}
