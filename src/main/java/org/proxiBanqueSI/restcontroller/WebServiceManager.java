package org.proxiBanqueSI.restcontroller;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.CurrentAccount;
import org.proxiBanqueSI.model.Manager;
import org.hibernate.mapping.Set;
import org.proxiBanqueSI.dto.Virement;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceManager {
	
	@Autowired
	private IClientService clientService;
	
		
	@Autowired
	private IManagerService managerService;
	
	
	private IPersonService personService;	
	public WebServiceManager(IPersonService personService) {
		this.personService = personService;
	}

	// CRUD Directeurs agence
	@GetMapping("/managers")	
	public List<Manager> getAllManagers() {
		return managerService.listManagers();
	}
	
	@PostMapping("/manager")
	public Manager createManager(@RequestBody Manager manager) {
		return managerService.addManager(manager);
	}
	
	@GetMapping("/employees")
	public List<Person> getAllPerson() {
		return personService.listPerson();
	  }
	// modifier les information du directeur
}
	   
///////////////////////////////////////////////////////////////////
//	@PostMapping("/virement/{id}")
//	public void virementClient(@PathVariable Long id, @RequestBody Virement vir) {
//		
//		java.util.Set<Account> accounts = clientService.findClientById(id).getAccounts();
//	}
//	
	

