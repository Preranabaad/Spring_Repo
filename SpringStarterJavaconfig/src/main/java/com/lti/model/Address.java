package com.lti.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address3")
@Scope(scopeName="prototype")
public class Address {
	
	private String street,city,pin;
	
	public Address(){
		
	}

	public Address(String street, String city, String pin) {
		super();
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
	

}
