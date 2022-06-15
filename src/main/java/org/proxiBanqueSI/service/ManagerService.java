package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Manager;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class ManagerService implements IManagerService {

	private PersonRepository personRepository ;
		
	public ManagerService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

	@Override
	public Manager addManager(Manager m) {
		return personRepository.save(m);
	}

	@Override
	public List<Manager> listManagers() {
		return personRepository.findAllManager();
	}

	@Override
	public void deleteManagerById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Manager updateManager(Manager client) {
		// TODO Auto-generated method stub
		return null;
	}
//
//	@Override
//	public Client updateManager(Client client) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
