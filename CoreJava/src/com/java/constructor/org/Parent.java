package com.java.constructor.org;

public class Parent {
	int a;
	int b;
	public Parent() {
		
		System.out.println("This is parent");
	}
	
	Parent(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
	public void m1() {
		int m=3;
		System.out.println(m);
	}
}
