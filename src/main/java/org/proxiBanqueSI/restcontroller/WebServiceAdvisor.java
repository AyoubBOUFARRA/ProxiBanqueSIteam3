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
	@PostMapping("/{id_directeur}/advisor")
	public Advisor createAdvisor(@PathVariable Long id_directeur, @RequestBody Advisor advisor) {
	return advisorService.addAdvisor(advisor, id_directeur);	
	}
	
	@GetMapping("/{id_directeur}/advisors")
	public List<Advisor> getAllAdvisorsByManger(@PathVariable Long id_directeur) {
		return advisorService.getAllAdvisorsByManger(id_directeur);
	}
}
