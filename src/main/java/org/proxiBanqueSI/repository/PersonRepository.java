package org.proxiBanqueSI.repository;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Employee;
import org.proxiBanqueSI.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	@Query("select e from Employee e")
	public List<Employee> findAllEmployees();
	
	@Query("select c from Client c")
	public List<Client> findAllClient();

}
