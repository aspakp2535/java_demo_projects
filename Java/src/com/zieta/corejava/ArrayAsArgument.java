package com.zieta.corejava;

public class ArrayAsArgument {

public int addElements (int num[]) {
		int sum = 0;
		for(int value:num) {
		sum = sum + value;
		}
		return sum;
		}

	public void change (int num []) {
		for(int i = 0; i < num.length; i++) {
		num[i]++;
		}
	}
}