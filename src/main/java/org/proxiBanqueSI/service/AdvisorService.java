package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class AdvisorService implements IAdvisorService {
	
	private PersonRepository personRepository;

	public AdvisorService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Advisor addAdvisor(Advisor e) {
		return null;
	}

	@Override
	public List<Advisor> listAdvisors() {
		return personRepository.findAllAdvisors();
	}

}
