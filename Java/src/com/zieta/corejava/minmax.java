package com.zieta.corejava;

public class minmax {

	public static void main(String[] args) {
		int[] arr = {3,16,20,25,30,80,15,16,2};
		int min=arr[0],max=arr[0];
	    for (int i = 1; i < arr.length; i++) {
	    	
	        if (arr[i] < min) {
	            min = arr[i];
	            
	        }
	        if (arr[i] > max) {
	            max = arr[i];
	           
	        }
	        
	    }
	    System.out.println("Minimum value: " + min);
	    System.out.println("Maximum value: " + max);
	}

}


