package com.zieta.corejava;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
		for (int i = 1; i <= numRows; i++) {
	        // Print spaces before the asterisks
	        for (int j = 1; j <= numRows - i; j++) {
	            System.out.print(" ");
	        }

	        // Print asterisks
	        for (int j = 1; j <= 2 * i - 1; j++) {
	            System.out.print("*");
	        }

	        // Move to the next line
	        System.out.println();
	    }
	}

}
