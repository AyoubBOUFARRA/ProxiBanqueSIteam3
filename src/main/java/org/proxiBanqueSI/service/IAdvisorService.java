package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Advisor;

public interface IAdvisorService {
	Advisor addAdvisor(Advisor e, Long id);
	List<Advisor> listAdvisors();
	public List<Advisor> getAllAdvisorsByManger(Long id);
}
