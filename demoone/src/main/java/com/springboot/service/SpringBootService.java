package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dao.SpringBootDao;
import com.springboot.request.Accounts;
import com.springboot.model.Account;



@Service
public class SpringBootService {
	@Autowired
	SpringBootDao springBootDao;
	@Transactional
	public void saveAccount(Accounts accounts) {
		System.out.println(accounts);
		Account account = new Account();
		account.setAccountNumber(accounts.getAccountNumber());
		account.setOwner(accounts.getOwner());
		account.setBalance(accounts.getBalance());
		
		springBootDao.save(account);
	}

	
}
