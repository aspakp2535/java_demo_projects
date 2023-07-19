package com.zieta.corejava;

public class PetersonNumber {

	public static void main(String[] args) {
		int num=125;
		int fact=1;
		int sum=0;
		int temp=num;
		
		while(num>0) {
			int rem=num%10;
			for(int i=rem;i>0;i--) {
				fact=fact*i;
			}
			sum = sum+fact;
			num=num/10;
			fact=1;
		}
		
		System.out.println(sum);
		if(temp==sum)
			System.out.println("Its a Peterson Number");
		else
			System.out.println("Its not a Peterson Number");
	}
}
