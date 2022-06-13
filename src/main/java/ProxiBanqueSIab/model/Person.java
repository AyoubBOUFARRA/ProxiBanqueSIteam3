package ProxiBanqueSIab.model;

import lombok.Data;

@Data
public class Person {

	private String firstname;
	private String lastname;
	private Address address;
	private String phone;
}
