package org.proxiBanqueSI.restcontroller;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Employee;
import org.proxiBanqueSI.model.Person;
import org.proxiBanqueSI.service.IClientService;
import org.proxiBanqueSI.service.IEmployeeService;
import org.proxiBanqueSI.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {
	
	@Autowired
	private IClientService clientService;
	
	@Autowired
	private IEmployeeService employeeService;
	
	
	private IPersonService personService;	
	public WebService(IPersonService personService) {
		this.personService = personService;
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.listEmployee();
	  }
	@GetMapping("/persons")
	public List<Person> getAllPerson() {
		return personService.listPerson();
	  }
	@GetMapping("/clients")
	public List<Client> getAllClient() {
		return clientService.listClient();
	  }
	  
	@PostMapping("/client")
	public Client createClient(@RequestBody Client c){
		System.out.println(c);
		return clientService.addClient(c);
		}
}
