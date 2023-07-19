package com.zieta.corejava;

public class CheckPositive {

	public static void main(String[] args) {
		CheckPositiveFunc obj=new CheckPositiveFunc();
		int val=obj.Addition(-10, 6);
		if(val>0) {
			System.out.println(val+" is a Positive Number");
		}
		else {
			System.out.println(val+" is a Negative Number");
		}

	}

}
