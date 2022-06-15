package org.proxiBanqueSI.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
@Entity
public class CurrentAccount extends Account {

	private float overdraft = 1000;

	public CurrentAccount() {
	}

	public CurrentAccount(float balance, String accountId) {
		super(balance, accountId);
		// this.overdraft = overdraft;
	}
	
	
	
}
