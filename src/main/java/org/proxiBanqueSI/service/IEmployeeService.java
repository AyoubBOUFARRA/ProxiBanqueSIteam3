package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Employee;

public interface IEmployeeService {
	Employee addClient(Employee e);
	List<Employee> listClient();
}
