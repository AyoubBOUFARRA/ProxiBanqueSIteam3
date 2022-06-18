package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Advisor;
import org.springframework.web.bind.annotation.PathVariable;

public interface IAdvisorService {
	Advisor addAdvisor(Advisor e, Long id);
	List<Advisor> listAdvisors();
	public List<Advisor> getAllAdvisorsByManger(Long id);
	public Advisor updateAdvisor(Long id, Advisor advisor);
	public void deleteAdvisorAndClient(@PathVariable Long id);
}
