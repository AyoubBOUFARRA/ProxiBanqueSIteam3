package ProxiBanqueSIab.model;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
 class Client extends Person {
	@Embedded
	private Account account;
	private CardLevel cardLevel;
	
	public enum CardLevel {
		CLASSIC, PREMIER;
	}
	
	public Client() {
		super();
	}

	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Client(Account account, CardLevel cardLevel, Employee employee) {
		super();
		this.account = account;
		this.cardLevel = cardLevel;
		this.employee = employee;
	}
	
	
}
