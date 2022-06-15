package org.proxiBanqueSI.restcontroller;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.CurrentAccount;
import org.proxiBanqueSI.model.Manager;
import org.proxiBanqueSI.model.Account;
import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.model.Person;
import org.proxiBanqueSI.model.SavingsAccount;
import org.proxiBanqueSI.service.IClientService;
import org.proxiBanqueSI.service.IManagerService;
import org.proxiBanqueSI.service.IAccountService;
import org.proxiBanqueSI.service.IAdvisorService;
import org.proxiBanqueSI.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebService {
	
	@Autowired
	private IClientService clientService;
	
	@Autowired
	private IAccountService accountService;
	
	@Autowired
	private IAdvisorService advisorService;
	
	@Autowired
	private IManagerService managerService;
	
	
	private IPersonService personService;	
	public WebService(IPersonService personService) {
		this.personService = personService;
	}
	@GetMapping("/advisors")
	public List<Advisor> getAllAdvisors() {
		return advisorService.listAdvisors();
	  }
	
	@GetMapping("/managers")	
	public List<Manager> getAllManagers() {
		return managerService.listManagers();
	}
	@GetMapping("/employees")
	public List<Person> getAllPerson() {
		return personService.listPerson();
	  }
	@GetMapping("/clients")
	public List<Client> getAllClient() {
		return clientService.listClient();
	  }
	
	@GetMapping("/accounts")
	public List<Account> getAllAcount() {
		return accountService.listAcounts();
	  }
	  
	@PostMapping("/client")
	public Client createClient(@RequestBody Client c){
		
		return clientService.addClient(c);
		}	
	@DeleteMapping("/client/{id}")
	public void deleteClient(@PathVariable("id") Long id) {
		clientService.deleteClientById(id);
	}
	
	@PutMapping("/client")
	public Client updateClient(@RequestBody Client client) {
		return clientService.updateClient(client);
	}
}
