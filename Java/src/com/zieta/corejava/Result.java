package com.zieta.corejava;

public class Result {

	public static void main(String[] args) {
		int sub1=65, sub2=56, sub3=89, sub4=76, sub5=52, sub6=90;
		int total=sub1+sub2+sub3+sub4+sub5+sub6;
		int avg=total/6;
		System.out.println("Total Marks is "+total);
		System.out.println("Average is "+avg);
		if(avg>0&&avg<35) {
			System.out.println("Fail");
		}else if(avg>35&&avg<45) {
			System.out.println("Pass");
		}else if(avg>45&&avg<55) {
			System.out.println("Second class");
		}else if(avg>55&&avg<60) {
			System.out.println("Higher Second class");
		}else if(avg>60&&avg<70) {
			System.out.println("First class");
		}else if(avg>70&&avg<100) {
			System.out.println("Distinction");
		}else {
			System.out.println("Invalid condition");
		}

	}

}
