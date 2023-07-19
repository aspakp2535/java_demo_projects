package com.zieta.javaassignmenttwo;

import java.util.Scanner;

class circle{
	double radius;

    circle() {
        radius = 0;
    }

    circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class ConstructorOverLoadingForAreaCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Constructor Start \n");
		System.out.println("Non parameterized constructor");
		circle c1 = new circle();
		System.out.println("Area of circle 1: " + c1.area()+"\n");
		
		System.out.println("First Constructor End \n");
		
		System.out.println("Second Constructor Start \n");
		System.out.println("parameterized constructor");
		System.out.println("Enter the value of radius");
		int num=sc.nextInt();
        circle c2 = new circle(num);
        System.out.println("Area of circle 2: " + c2.area()+"\n");
        System.out.println("Second Constructor End \n");

	}

}
