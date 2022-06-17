package org.proxiBanqueSI.restcontroller;

import java.util.List;

import org.proxiBanqueSI.model.Account;
import org.proxiBanqueSI.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class WebServiceAccount {
	

	@Autowired
	private IAccountService accountService;
	
	@GetMapping("/accounts")
	public List<Account> getAllAcount() {
		return accountService.listAcounts();

}
}
