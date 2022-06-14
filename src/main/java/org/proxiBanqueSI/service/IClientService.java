package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Client;
import org.proxiBanqueSI.model.Employee;
import org.proxiBanqueSI.model.Person;

public interface IClientService {
	Person addClient(Client c);
	List<Employee> listEmployee();
}
