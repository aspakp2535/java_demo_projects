package com.springboot.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Accounts {
	@JsonProperty("AccountNumber")
	private String accountNumber;
	@JsonProperty("Owner")
	private String owner;
	@JsonProperty("Balance")
	private String balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts [accountNumber=" + accountNumber + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	
	
	
}
