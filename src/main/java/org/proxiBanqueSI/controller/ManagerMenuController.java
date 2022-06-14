package org.proxiBanqueSI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/manager")
public class ManagerMenuController {
	
	@GetMapping(value = "/page-menu")
	public String menuPage() {
		return "manager/page-menu";
	}
	

}
