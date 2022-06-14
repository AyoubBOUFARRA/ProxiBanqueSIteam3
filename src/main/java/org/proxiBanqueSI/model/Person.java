package org.proxiBanqueSI.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	private String phone;
	
	@Embedded
	private Address address;
		
	public Person() {
		super();
	}

	public Person(String firstname, String lastname, Address address, String phone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
	}
	
	
}
