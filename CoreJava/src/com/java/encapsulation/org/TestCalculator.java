package com.java.encapsulation.org;

public class TestCalculator {

	public static void main(String[] args) {
	
		Calculator c= new Calculator();
		System.out.println(c.addition(0, 2));	
		System.out.println(c.subtract(6,3));
		System.out.println(c.multiply(5, 5));;
		System.out.println(c.divide(25, 5));
		System.out.println(c.divide(25, 0));
	}

}
