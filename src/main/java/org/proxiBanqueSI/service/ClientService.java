
package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Employee;
import org.proxiBanqueSI.model.Person;
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
		return personRepository.save(c);
	}
	
	@Override
	public List<Client> listClient() {
		return personRepository.findAllClient();
	}

}
