package org.proxiBanqueSI.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Manager extends Person {
	
	public Manager() {
	}
	
	public Manager(String firstname, String lastname, Address address, String phone) {
		super(firstname, lastname, address, phone);
	
	}
	
	@OneToMany(mappedBy = "manager", cascade = {CascadeType.PERSIST})
	private Set<Advisor> advisors = new HashSet<Advisor>();
	
	@JsonIgnore
	public Set<Advisor> getAdvisors() {
		return advisors;
	}

	public void setAdvisors(Set<Advisor> advisors) {
		this.advisors = advisors;
	}
	
	public Advisor addClient(Advisor advisor) {
		advisors.add(advisor);
		advisor.setManager(this);;		
		return advisor;		
	}
}
