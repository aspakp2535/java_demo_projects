package com.zieta.corejava;

public class TestArrayAsArgument {
	public static void main(String[] args) {
		int num[] = {10,20,30,40};
		ArrayAsArgument obj = new ArrayAsArgument();
		int sum = obj.addElements (num);
		System.out.println(sum);
		System.out.println(obj.addElements (new int[]{1,2,3,4}));
		obj.change(num);
		for(int value:num) {
			System.out.println(value);
		}
	}
}
