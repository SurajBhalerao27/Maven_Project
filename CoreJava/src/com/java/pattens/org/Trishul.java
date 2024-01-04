package com.java.pattens.org;

public class Trishul {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 5; j++) {

				if (((i <= 3) && j % 2 != 0) || j == 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
