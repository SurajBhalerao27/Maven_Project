package com.java.switchcase.org;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double num1, num2, result;
		int operator;

		System.out.println("Welcome to basic Clalculator ");

		while(true) {

			System.out.print("Enter the choice no\n1. Addition\n2. Substraction\n3. Multiplication\n4. Divisio\n5. to exit: ");

			operator = input.next().charAt(0);

			switch (operator) {
			case '1':
				System.out.print("Enter first number: ");
				num1 = input.nextDouble();

				System.out.print("Enter second number: ");
				num2 = input.nextDouble();
				result = num1 + num2;
				System.out.println("Result: " + result);
				break;
			case '2':
				System.out.print("Enter first number: ");
				num1 = input.nextDouble();

				System.out.print("Enter second number: ");
				num2 = input.nextDouble();
				result = num1 - num2;
				System.out.println("Result: " + result);
				break;
			case '3':
				System.out.print("Enter first number: ");
				num1 = input.nextDouble();

				System.out.print("Enter second number: ");
				num2 = input.nextDouble();
				result = num1 * num2;
				System.out.println("Result: " + result);
				break;
			case '4':
				System.out.print("Enter first number: ");
				num1 = input.nextDouble();

				System.out.print("Enter second number: ");
				num2 = input.nextDouble();
				if (num2 != 0) {
					result = num1 / num2;
					System.out.println("Result: " + result);
				} else {
					System.out.println("Error: Division by zero!");
				}
				break;
			case '5':
				System.out.println("Program Terminated by user");
				input.close();
				System.exit(0);                   
				break;
			default:
				System.out.println("Error: Invalid operator");
			}		
		}
	}
}
