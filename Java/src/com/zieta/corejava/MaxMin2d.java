package com.zieta.corejava;

public class MaxMin2d {
	
	public static void max(int num[][]) {
		int max=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[0].length;j++) {
				if(max<num[i][j]) {
					max=num[i][j];
				}
				
			}
		}
		System.out.println(max);
	}
	
	public static void min(int num[][]) {
		int min=num[0][0];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[0].length;j++) {
				if(min>num[i][j]) {
					min=num[i][j];
				}
				
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int num[][]=new int[2][2];
		num[0][0]=20;
		num[0][1]=10;
		num[1][0]=40;
		num[1][1]=30;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[0].length;j++) {
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println("");
	}
		max(num);
		min(num);
	

}
}
