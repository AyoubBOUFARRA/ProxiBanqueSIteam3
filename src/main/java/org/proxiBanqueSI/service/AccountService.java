package org.proxiBanqueSI.service;

import java.util.List;

import org.proxiBanqueSI.model.Account;
import org.proxiBanqueSI.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
	
	private AccountRepository accountRepository; 


	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public List<Account> listAcounts() {
		
		return accountRepository.findAll();
	}
	


}
