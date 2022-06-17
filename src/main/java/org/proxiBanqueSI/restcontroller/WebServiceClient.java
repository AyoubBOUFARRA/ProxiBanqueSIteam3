package org.proxiBanqueSI.restcontroller;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceClient {
	
	@Autowired
	private IClientService clientService;
	
	// CRUD client
	@GetMapping("listclients")
	public List<Client> getAllClient() {
		return clientService.listClient();
	  }
	@GetMapping("/advisor/{id}/listclients")
	public List<Client> getAllClientByAdvisor(@PathVariable Long id) {
		return clientService.getAllClientByAdvisor(id);
	  }

	@PostMapping("/createclient")
	public Client createClient(@RequestBody Client c){		
		return clientService.addClient(c);
		}
		
	@PostMapping("/advisor/{id}/createclient")
	public Client createClientByAdvisor(@PathVariable Long id, @RequestBody Client c){	
		return clientService.addClientByAdvisor(id, c);
		}
	
	@DeleteMapping("/deleteclient/{id}")
	public void deleteClient(@PathVariable Long id) {
		clientService.deleteClientById(id);
	}
	
	@PutMapping("/client/{id}")
	public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
		return clientService.updateClient(id, client);
	}
}
