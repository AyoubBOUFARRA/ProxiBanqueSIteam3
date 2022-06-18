package org.proxiBanqueSI.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;



//@Data
@Entity
public class Advisor extends Person{
	
//	public enum Role{
//		ADVISOR, MANAGER;
//	}
//	@Enumerated(EnumType.STRING)
//	private Role role;
		
	public Advisor() {
	}
	
	public Advisor(String firstname, String lastname, Address address, String phone) {
		super(firstname, lastname, address, phone);
		//this.role = role;
	}


	@OneToMany(mappedBy = "advisor", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Client> clients = new HashSet<Client>();


//	public Role getRole() {
//		return role;
//	}

//	public void setRole(Role role) {
//		this.role = role;
//	}
	@JsonIgnore
	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="manager_id")
	private Manager manager;
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Client addClient(Client client) {
		clients.add(client);
		client.setAdvisor(this);		
		return client;		
	}
	
}
