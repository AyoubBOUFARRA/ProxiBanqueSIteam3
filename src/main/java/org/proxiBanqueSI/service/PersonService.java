package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Person;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

	private PersonRepository personRepository;
	
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> listPerson() {
		return personRepository.findAll();
	}

}
