package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Employee;
import org.proxiBanqueSI.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
	
	private PersonRepository personRepository;

	public EmployeeService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Employee addEmployee(Employee e) {
		return null;
	}

	@Override
	public List<Employee> listEmployee() {
		return personRepository.findAllEmployees();
	}

}
