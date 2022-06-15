package org.proxiBanqueSI.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter

@Entity
 public class Client extends Person {
	
	private String cardLevel;
//	@OneToOne
//	@JoinColumn(unique = true)
//	private Account account;
	
	@OneToMany(mappedBy = "client", cascade = {CascadeType.PERSIST})
	private Set<Account> accounts = new HashSet<Account>();
	
//	@Enumerated(EnumType.STRING)
//	private CardLevel cardLevel;
	
//	public enum CardLevel {
//		CLASSIC, PREMIER
//	}
//	
	public Client() {
	}	
	
	public Client(String firstname, String lastname, Address address, String phone, String cardLevel) {
		super(firstname, lastname, address, phone);
//		this.account = account;
		this.cardLevel = cardLevel;
	}

	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="advisor_id")
	private Advisor advisor;
		
	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}
	
//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	
	public Set<Account> getAccounts() {
		return accounts;
	}

	public String getCardLevel() {
		return cardLevel;
	}

	public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}

	public Advisor getAdvisor() {
		return advisor;
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
		account.setClient(this);
	}
	
}
