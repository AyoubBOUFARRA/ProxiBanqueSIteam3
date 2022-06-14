package org.proxiBanqueSI.model;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//@Getter
//@Setter
@Entity
 public class Client extends Person {
	@Embedded
	private Account account;
	
	@Enumerated(EnumType.STRING)
	private CardLevel cardLevel;
	
	public enum CardLevel {
		CLASSIC, PREMIER
	}
	
	public Client() {
	}	
	
	public Client(String firstname, String lastname, Address address, String phone, Account account, CardLevel cardLevel) {
		super(firstname, lastname, address, phone);
		this.account = account;
		this.cardLevel = cardLevel;
	}


	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="employee_id")
	private Employee employee;
		
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public CardLevel getCardLevel() {
		return cardLevel;
	}

	public void setCardLevel(CardLevel cardLevel) {
		this.cardLevel = cardLevel;
	}

	public Employee getEmployee() {
		return employee;
	}
	
}
