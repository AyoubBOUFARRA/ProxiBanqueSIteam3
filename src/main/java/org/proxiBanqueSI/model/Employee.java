package org.proxiBanqueSI.model;

import lombok.Data;

@Data
public class Employee {

	private String id;
	private Role role;
	
	public enum Role{
		ADVISOR, MANAGER;
	}
	
}
