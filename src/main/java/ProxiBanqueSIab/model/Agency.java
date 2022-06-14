package ProxiBanqueSIab.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Agency {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@Embedded
	private Address address;
	//private Employee manager;
	private String identificationNumber;
	private Date creationDate;
	
	public Agency() {
		super();
	}
	
	
	
}
