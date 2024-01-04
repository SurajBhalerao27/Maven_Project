package com.java.doubt.org;

public class Customer extends Bank {
	String name;
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Bank.addBalance(100);
		System.out.println(Bank.showBalance());
		Bank.addBalance(200);
		System.out.println(Bank.showBalance());
	}

}
