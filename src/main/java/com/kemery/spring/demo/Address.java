package com.kemery.spring.demo;

public class Address {

	private String street;
	private String postcode;
	
	public Address(String street, String postcode) {
		
		this.street = street;
		this.postcode = postcode;
	}
	
	
	public void init() {
		
		System.out.println("Bean created: " + this);
	}
	
	
	public void destroy() {
		
		System.out.println("Bean destroyed: " + this);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	
}
