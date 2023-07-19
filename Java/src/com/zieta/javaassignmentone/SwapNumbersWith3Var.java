package com.zieta.javaassignmentone;

import java.util.Scanner;

public class SwapNumbersWith3Var {

	public static void swap(int num1, int num2) {
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swap");
		System.out.println("value of First: "+num1);
		System.out.println("value of Second: "+num2);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Value : ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Value : ");
		int num2=sc.nextInt();
		swap(num1,num2);
		

	}

}
