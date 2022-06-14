package ProxiBanqueSIab.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Embeddable
public class Account {

	// private String id;
	private float balance;
	
	public Account() {
		super();
	}
	
	
}
