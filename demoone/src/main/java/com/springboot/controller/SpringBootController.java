package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.request.Accounts;
import com.springboot.service.SpringBootService;



@RestController
@RequestMapping("/account")
public class SpringBootController {
	@Autowired
	SpringBootService springBootService;

	@PostMapping("/save")
	public String createAccount(@RequestBody Accounts accounts) {
		
		springBootService.saveAccount(accounts);

		return "Success";
	}
	
}
