package com.java.exception.org;

public class Test {

	public static void main(String[] args) {

//		try {
//
//			Class.forName("com.java.exception.org.E");
//			Class.forName("com.java.exception.org.X");
//		} 
//		catch (ClassNotFoundException e) {
//
//			e.printStackTrace();
//		}	
		int a=10;
		int b=0;
		try {
			int result=a/b; //ArithmeticException e= new ArithmeticException();
							//divide by zero
							//throw e; ///raising of an exception
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Bye");
	}
}
