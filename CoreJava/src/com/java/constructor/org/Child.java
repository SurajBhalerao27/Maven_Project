package com.java.constructor.org;
public class Child extends Parent{

	public Child() {
		super();
		System.out.println("This is child");
	}
	public Child(int a,int b) {
		super(a,b);
		this.a=a;
		this.b=b;
		System.out.println("This is child");
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		Parent p=new Child();
		Child c1=new Child(12,12);
		Parent p1 = new Child(9,7);
		System.out.print(c);
		System.out.print(c1);
		System.out.print(p);
		System.out.print(p1);
		p.m1();
		c.m1();
	}
}
