package com.zieta.javaassignmentone;

import java.util.Scanner;

public class Palindrome {
	private static int reverse(int num) {
		int reminder,reverse=0;
		while(num>0) {
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}	
		return reverse;
	}
	public static void palindrome(int value,int num) {
		if(value==num)
			System.out.println("Given Integer is Palindrome");
		else
			System.out.println("Given Integer is not a Palindrome");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value : ");
		int num=sc.nextInt();
		
		int value=reverse(num);
		palindrome(value,num);

	}

}
