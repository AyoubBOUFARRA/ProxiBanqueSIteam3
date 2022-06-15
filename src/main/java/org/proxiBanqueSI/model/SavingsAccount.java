package org.proxiBanqueSI.model;

import javax.persistence.Entity;

import lombok.Data;

// @Data
@Entity
public class SavingsAccount extends Account {

	private float payRate = (float) 0.03;

	public SavingsAccount() {
	}

	public SavingsAccount(float balance, String accountId) {
		super(balance, accountId);
	}	
}
