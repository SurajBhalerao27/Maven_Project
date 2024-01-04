package com.java.pattens.org;

public class Cross {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==3 && j==3) {
					System.out.print("@ ");
				}
				else if(i+j==6) {
					System.out.print("# ");
				}
				else if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}			
}


