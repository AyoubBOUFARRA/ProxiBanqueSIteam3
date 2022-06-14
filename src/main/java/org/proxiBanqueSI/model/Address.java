package org.proxiBanqueSI.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {

	private String street;
	private String zip;
	private String city;
	
	public Address() {
		super();
	}

	public Address(String street, String zip, String city) {
		this.street = street;
		this.zip = zip;
		this.city = city;
	}
	
	
	
	
	
}
