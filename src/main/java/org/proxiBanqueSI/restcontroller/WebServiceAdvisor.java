package org.proxiBanqueSI.restcontroller;

import java.util.List;

import org.proxiBanqueSI.model.Advisor;
import org.proxiBanqueSI.service.IAdvisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceAdvisor {
	
	@Autowired
	private IAdvisorService advisorService;

	// CRUD Conseillers
	@GetMapping("/advisors")
	public List<Advisor> getAllAdvisors() {
		return advisorService.listAdvisors();
	  }
	@PostMapping("/manager/{id}/advisor")
	public Advisor createAdvisor(@PathVariable Long id, @RequestBody Advisor advisor) {
	return advisorService.addAdvisor(advisor, id);	
	}
	
	@GetMapping("/manager/{id}/advisors")
	public List<Advisor> getAllAdvisorsByManger(@PathVariable Long id) {
		return advisorService.getAllAdvisorsByManger(id);
	}
	
	// methode update a faire conseiler
	// methode delete conseiller
}
