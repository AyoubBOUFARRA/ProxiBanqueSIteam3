package ProxiBanqueSIab.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client extends Person {

	private String id;
	private Account account;
	private CardLevel cardLevel;
	
	public enum CardLevel {
		CLASSIC, PREMIER;
	}
}
