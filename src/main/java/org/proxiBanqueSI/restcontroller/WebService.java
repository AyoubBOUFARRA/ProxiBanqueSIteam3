package org.proxiBanqueSI.restcontroller;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Employee;
import org.proxiBanqueSI.model.Person;
import org.proxiBanqueSI.service.IClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {
	
	private final IClientService clientService;
	
	public WebService(IClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/employees")
	public Iterable<Employee> getAllEmployee() {
		return clientService.listEmployee();
	  }
	  
	@PostMapping("/client")
	public Person createClient(@RequestBody Client c){
		System.out.println(c);
		return clientService.addClient(c);
		}
}
