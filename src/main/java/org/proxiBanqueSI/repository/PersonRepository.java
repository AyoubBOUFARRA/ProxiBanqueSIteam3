package org.proxiBanqueSI.repository;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Manager;
import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	@Query("select a from Advisor a")
	public List<Advisor> findAllAdvisors();
	
	@Query("select c from Client c")
	public List<Client> findAllClient();
	
	@Query("select m from Manager m")
	public List<Manager> findAllManager();

}
