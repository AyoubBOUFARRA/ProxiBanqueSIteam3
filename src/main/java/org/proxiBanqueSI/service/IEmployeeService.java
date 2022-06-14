package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Employee;

public interface IEmployeeService {
	Employee addEmployee(Employee e);
	List<Employee> listEmployee();
}
