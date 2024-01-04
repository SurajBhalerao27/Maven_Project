package com.java.doubt.org;

public class Bank {

	static double balance;
	
	public Bank() {
		
	}
	
	Bank(double balance) {
		super();
		Bank.balance = balance;
	
	}
	
	static void addBalance(int b) {
		balance=balance+b;
	}
	static int z=9;
	static double showBalance() {

		return balance;
	}

}
