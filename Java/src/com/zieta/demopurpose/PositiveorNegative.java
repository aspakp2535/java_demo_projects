package com.zieta.javaassignmentone;

import java.util.Scanner;

public class PositiveorNegative {
	public static void checkPositive(int num) {
		if(num==0) 
			System.out.println("Given Value is zero");
		
		else if(num>0) 
			System.out.println("Given Value is in Positive");
	
		else
			System.out.println("Given Value is in Negative");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int num=sc.nextInt();
		
		checkPositive(num);

	}

}
