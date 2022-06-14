package org.proxiBanqueSI.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Embeddable
public class Account {

	// private String id;
	private float balance;
	
	public Account() {
	}

	public Account(float balance) {
		this.balance = balance;
	}
	
		
}
