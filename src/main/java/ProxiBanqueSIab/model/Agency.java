package ProxiBanqueSIab.model;

import java.util.Date;

import lombok.Data;

@Data
public class Agency {

	private String name;
	private Employee manager;
	private String identificationNumber;
	private Date creationDate;
	
}
