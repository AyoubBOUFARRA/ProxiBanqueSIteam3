package ProxiBanqueSIab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/advisor")
public class AdvisorMenuController {
	
	@GetMapping(value = "/page-menu")
	public String menuPage() {
		return "advisor/page-menu";
	}
	
	@GetMapping(value = "/gestion-client")
	public String gestionClientPage() {
		return "advisor/gestion-client";
	}
	
	@GetMapping(value = "/gestion-compte")
	public String gestionComptePage() {
		return "advisor/gestion-compte";
	}
	

}
