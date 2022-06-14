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
import org.proxiBanqueSI.model.Employee;
import org.proxiBanqueSI.model.Employee.Role;

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
		List<Person> persons = List.of(new Employee("Pierre", "Dupont", address1, "06128476464", Role.ADVISOR), new Employee("Bob", "Marley", address2, "06128476464", Role.MANAGER));
		
		org.proxiBanqueSI.model.Address address3 = new org.proxiBanqueSI.model.Address("55 rue Francois Mitterand", "77400", "Chelle");
		org.proxiBanqueSI.model.Address address4 = new org.proxiBanqueSI.model.Address("30 rue Jacque Jirac", "59300", "Valeciennes");
		List<Person> persons1 = List.of(new Employee("Pierre", "Dupont", address3, "06128476464", Role.ADVISOR), new Employee("Bob", "Marley", address4, "06128476464", Role.MANAGER));
				
				
		personRepository.saveAll(persons);
		List<Person> pers = personRepository.findAll();
		System.out.println(pers);
	}

}
