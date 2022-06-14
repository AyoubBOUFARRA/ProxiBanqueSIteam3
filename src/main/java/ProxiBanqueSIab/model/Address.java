package ProxiBanqueSIab.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {

	private String street;
	private String zip;
	private String city;
	
	public Address() {
		super();
	}
	
	
	
}
