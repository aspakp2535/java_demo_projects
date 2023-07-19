package com.zieta.corejava;

public class Armstrong {
		public static void main(String[] args) {
			 int arm=0;
			for(int i=1;i<=1000;i++) {
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
			arm=0;
		}
	}
}

