package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Manager;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AdvisorService implements IAdvisorService {
	
	private PersonRepository personRepository;

	public AdvisorService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Advisor addAdvisor(Advisor a , Long id) {
		Manager manager =  personRepository.findManagerById(id);
		manager.addClient(a);
		return personRepository.save(a);
	}

	@Override
	public List<Advisor> listAdvisors() {
		return personRepository.findAllAdvisors();
	}
	
	@Override
	public List<Advisor> getAllAdvisorsByManger(Long id){
		return personRepository.getAdvisorByManager(id);
	}
	
	@Override
	public Advisor updateAdvisor(Long id, Advisor advisor) {
		Advisor a = personRepository.findAdvisorById(id);
		a.setAddress(advisor.getAddress());
		a.setFirstname(advisor.getFirstname());
		a.setLastname(advisor.getLastname());
		a.setPhone(advisor.getPhone());
		return personRepository.save(a);
	}
	@Override
	public void deleteAdvisorAndClient(Long id) {		
		personRepository.delete(personRepository.findAdvisorById(id));
		
	}
}
