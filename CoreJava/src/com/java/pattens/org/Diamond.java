package com.java.pattens.org;

public class Diamond {

	public static void main(String[] args) {
		
		int n = 5; // Adjust this value to change the size of the diamond
        
        if (n % 2 == 0) {
            System.out.println("Please use an odd number to create a diamond pattern.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            int spaces = Math.abs(i - (n / 2 + 1));
            int stars = n - 2 * spaces;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}