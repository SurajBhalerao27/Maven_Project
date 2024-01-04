package com.java.doubt.org;

public class A {
	
	static int y=3;
	static int x=1;
	static int z=0;
	
	void m1() {
		z=1;
		x++;
		y++;
		++y;
		++x;
		z=x+y;
		z=y-x;
	}
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		a1.m1();
		a2.m1();
		System.out.print(x+" "+y+" "+z);
		int a=2;
		int b=3;
		int c=a++ + --b;
		System.out.println("C="+c);
		int d=--a + b++;
		System.out.println("D="+d);
	}
}
