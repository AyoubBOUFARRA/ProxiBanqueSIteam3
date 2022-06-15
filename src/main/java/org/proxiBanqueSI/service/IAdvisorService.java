package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Advisor;

public interface IAdvisorService {
	Advisor addAdvisor(Advisor e);
	List<Advisor> listAdvisors();
}
