package com.zieta.javaassignmentone;

import java.util.Scanner;

public class MaxFrom3Num {
	public static void findMax(int num1,int num2,int num3) {
		if((num1>=num2)&&(num1>=num3)) 
			System.out.println("First value is Maximum");
		
		else if(num2>=num3) 
			System.out.println("Second value is Maximum");
	
		else
			System.out.println("Third value is Maximum");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Value : ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Value : ");
		int num2=sc.nextInt();
		System.out.println("Enter the Third Value : ");
		int num3=sc.nextInt();
		findMax(num1,num2,num3);

	}

}
