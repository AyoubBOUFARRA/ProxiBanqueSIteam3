
package org.proxiBanqueSI.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.CurrentAccount;
import org.proxiBanqueSI.dto.Virement;
import org.proxiBanqueSI.exception.ErrorException;
import org.proxiBanqueSI.exception.OrderNotFoundException;
import org.proxiBanqueSI.model.Account;
import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.model.Person;
import org.proxiBanqueSI.model.SavingsAccount;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class ClientService implements IClientService {

	private final PersonRepository personRepository;
	
	public ClientService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Client addClient(Client c) {
		// gerer le cas ou le conseiller ne peut pas creer plus de 10 clients
		// gerer le cas ou le client ne peut pas avoir 2 compte courant mais peut avoir un compte courant et un compte epagne
		this.createAccountForClient(c);
		return personRepository.save(c);
	}
	
	@Override
	public List<Client> listClient() {
		return personRepository.findAllClient();
	}
	
	@Override
	public void deleteClientById(Long id) {
		personRepository.deleteById(id);
	}
	
	@Override
	public Client updateClient(Client client) {
		return personRepository.save(client);
	}
	
	@Override
	public Client addClientByAdvisor(Long id, Client client){

		this.getAdvisor(id).addClient(client);
		return this.addClient(client);
	}
	@Override
	public Client findClientById(Long id) {
		return personRepository.findClientById(id);
	}
	public void createAccountForClient(Client client) {
		
		String clientId = "AGEPODHSJZ1344";
		Account compteCourant = new CurrentAccount(0, clientId, 1000);
		Account compteEpagne = new SavingsAccount(0, clientId, (float) 0.03);
		client.addAccount(compteCourant);
		client.addAccount(compteEpagne);
	}
	
	@Override
	public void virementClient(Long id, Virement vir) {
		
	}
	@Override
	public List<Client> getAllClientByAdvisor(Long id){
		return personRepository.getClientByAdvisor(id);
	}
	
//	public Advisor getOneAdvisor(Long id) {
//		List<Advisor> advisors = personRepository.findAllAdvisors();
//		advisors.stream().map(a -> a.getId().equals(id));
//		return null;
//	}
	
	public Advisor  getAdvisor(Long id) {
		Advisor advisor = personRepository.findAdvisorById(id);
		if (advisor == null) throw new OrderNotFoundException();	
		if(personRepository.findAdvisorById(id).getClients().size()>10) throw new OrderNotFoundException();
		return advisor;
	}
}
