package com.zieta.javaassignmenttwo;

import java.util.Scanner;

public class CubeOfGivenNumber {
	
	public static double cube(int num) {
		return (Math.pow(num, 3));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		CubeOfGivenNumber obj = new CubeOfGivenNumber();
		double cube=obj.cube(num);
		System.out.println("Cube of a Given Number : " +cube);

	}

}
