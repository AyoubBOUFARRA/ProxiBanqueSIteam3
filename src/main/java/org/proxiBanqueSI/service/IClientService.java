package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.dto.Virement;
import org.proxiBanqueSI.exception.ErrorException;
import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.model.Person;
import org.springframework.web.bind.annotation.RequestBody;

public interface IClientService {
	public Client addClient(Client c);
	public List<Client> listClient();
	public void deleteClientById(Long id);
	public Client updateClient(Client client);
	public Client addClientByAdvisor(Long id, Client client);
	public void virementClient(Long id, Virement vir);
	public Client findClientById(Long id);
	public List<Client> getAllClientByAdvisor(Long id);
}
