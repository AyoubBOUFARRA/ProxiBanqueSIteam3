package org.proxiBanqueSI.model;

import lombok.Data;

@Data
public class SavingsAccount extends Account {

	private float payRate;

	public SavingsAccount() {
		super();
	}
	
	
}
