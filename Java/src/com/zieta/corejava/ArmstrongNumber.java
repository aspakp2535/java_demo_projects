package com.zieta.corejava;

public class ArmstrongNumber {
	
	public static void arm(int i) {
		
		 int arm=0;
		 int num=i;
		int temp=num;
			while(num>0) {
				int rem=num%10;
				arm=arm+rem*rem*rem;
				num=num/10;
			}	
		if(temp==arm) {
			System.out.println(arm+" ");
		}
	}
	public static void main(String[] args) {

		for(int i=1;i<=1000;i++) {
			
			arm(i);
		}		

	}

}
