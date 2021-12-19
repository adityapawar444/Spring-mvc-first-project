package com.learn.springdemo;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="Enter a valid input")
	@Size(min=1,message="Enter a valid input")
	private String lastName;
	
	@NotNull(message = "Enter a valid input")
	@Min(value = 18, message="You must be an adult (more than 18 years)")
	@Max(value= 40, message="Your age must not be more than 40 years")
	private Integer age;
	
	@Pattern(regexp = "^[0-9]{6}", message = "invalid postal code")
	private String postalCode;
	
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	

}
