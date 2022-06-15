
package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.CurrentAccount;
import org.proxiBanqueSI.model.Account;
import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.model.Person;
import org.proxiBanqueSI.model.SavingsAccount;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.stereotype.Service;


@Service
public class ClientService implements IClientService {

	private final PersonRepository personRepository;
	
	public ClientService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Client addClient(Client c) {
		Account compteCourant = new CurrentAccount(0, "clientId1");
		Account compteEpagne = new SavingsAccount(0, "clientId");
		c.addAccount(compteCourant);
		c.addAccount(compteEpagne);
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
}
