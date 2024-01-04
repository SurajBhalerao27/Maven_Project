package com.java.encapsulation.org;

public class Calculator {
	
	int a;
	int b;
	int result;
	
	int addition(int a,int b) {
		this.a=a;
		this.b=b;
		result =a+b;
		return result;
	}
	int subtract(int a,int b) {
		this.a=a;
		this.b=b;
		result =a-b;
		return result;
	}
	int multiply(int a,int b) {
		this.a=a;
		this.b=b;
		result =a*b;
		return result;
	}
	int divide(int a,int b) {
		
		this.a=a;
		this.b=b;
		try {
		result =a/b;
		}
		
		catch(ArithmeticException e){
			System.err.println("Exception is caught you cannot divide it by zero");
		}
		
		return result;		
	}
}
