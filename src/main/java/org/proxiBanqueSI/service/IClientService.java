package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.model.Person;
import org.springframework.web.bind.annotation.RequestBody;

public interface IClientService {
	public Client addClient(Client c);
	public List<Client> listClient();
	public void deleteClientById(Long id);
	public Client updateClient(Client client);
}
