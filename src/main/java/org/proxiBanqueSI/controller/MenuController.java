package org.proxiBanqueSI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MenuController {

	@GetMapping(value = "/")
	public String indexPage() {
		
		return "index";
	}
	
	@GetMapping(value = "login")
	public String login() {
		return "login";
	}
	
	
	
}
