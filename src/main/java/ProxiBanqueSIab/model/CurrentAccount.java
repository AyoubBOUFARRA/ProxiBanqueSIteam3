package ProxiBanqueSIab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrentAccount extends Account {

	private float overdraft;

	public CurrentAccount() {
		super();
	}
	
	
}
