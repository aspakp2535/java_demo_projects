package com.zieta.corejava;

public class ReverseNumber {

	public static void main(String[] args) {
		
	int num=12345;
	int reminder,reverse=0;
	while(num>0) {
		reminder=num%10;
		reverse=reverse*10+reminder;
		num=num/10;
	}
	System.out.println(reverse);
	
	}
}
