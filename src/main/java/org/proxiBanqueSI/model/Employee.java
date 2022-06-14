package org.proxiBanqueSI.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;


//@Data
@Entity
public class Employee extends Person{

	private Role role;
	
	public enum Role{
		ADVISOR, MANAGER;
	}
	
	public Employee() {
	}
	
	public Employee(String firstname, String lastname, Address address, String phone, Role role) {
		super(firstname, lastname, address, phone);
		this.role = role;
	}


	@OneToMany(mappedBy = "employee", cascade = {CascadeType.PERSIST})
	private Set<Client> clients = new HashSet<Client>();


	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	
	public void addClient(Client client) {
		clients.add(client);
		client.setEmployee(this);
	}
	
	
}
