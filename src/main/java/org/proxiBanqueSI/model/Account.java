package org.proxiBanqueSI.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

// @Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float balance = 0;
	private String accountId;
	
	
//	@OneToOne(mappedBy = "account")
//	private Client client;
	
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="client_id")
	private Client client;
	
	public Account() {
	}
		
	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}



	public Account(float balance) {
		this.balance = balance;
	}

	public Account(float balance, String accountId) {
		this.balance = balance;
		this.accountId = accountId;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
