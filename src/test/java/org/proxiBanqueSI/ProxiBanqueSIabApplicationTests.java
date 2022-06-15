package org.proxiBanqueSI;

import java.util.List;

import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.Test;
//import org.proxiBanqueSI.repository.ClientRepository;
//import org.proxiBanqueSI.repository.EmployeeRepository;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Person;
import org.proxiBanqueSI.model.Advisor;


@SpringBootTest
class ProxiBanqueSIabApplicationTests {
	
//	@Autowired
//	private ClientRepository clientRepository;
//	
//	@Autowired
//	private EmployeeRepository employeeRepository;
	
	@Autowired
	private PersonRepository personRepository;

	@Test
	void contextLoads() {
		org.proxiBanqueSI.model.Address address1 = new org.proxiBanqueSI.model.Address("55 rue Francois Mitterand", "77400", "Chelle");
		org.proxiBanqueSI.model.Address address2 = new org.proxiBanqueSI.model.Address("30 rue Jacque Jirac", "59300", "Valeciennes");
		List<Person> persons = List.of(new Advisor("Pierre", "Dupont", address1, "06128476464"), new Advisor("Bob", "Marley", address2, "06218476464"));
		
		org.proxiBanqueSI.model.Address address3 = new org.proxiBanqueSI.model.Address("14 rueJacvque Jirac", "93000", "saint Denis");
		org.proxiBanqueSI.model.Address address4 = new org.proxiBanqueSI.model.Address("23 rue Emmanuel", "59400", "Valeciennes");
		List<Person> persons1 = List.of(new Advisor("Thierry", "Henry", address3, "08128476464"), new Advisor("Alex", "Kamga", address4, "09128476464"));
				
				
		personRepository.saveAll(persons1);
		List<Person> pers = personRepository.findAll();
		System.out.println(pers);
	}
	
//	@Test
//	void testCreationClient(Client c) {
//		
//	}

}
