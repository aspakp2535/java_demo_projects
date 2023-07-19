package com.zieta.javaassignmenttwo;

import java.util.Scanner;

public class ResultDisplay {

	private int mark;

	public ResultDisplay(int mark) {
		this.mark=mark;
	}
	
	public ResultDisplay() {
		
	}

	public int getMark() {
        return mark;
    }
	
	public int average(int total,int n) {
		return total/n;
	}
	public void display(int avg) {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		System.out.print("Enter the number of Subjects: ");
        int n = sc.nextInt();

        ResultDisplay[] result = new ResultDisplay[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of the Student");
            System.out.print("Mark "+(i+1)+" :");
            int mark = sc.nextInt();
          

            ResultDisplay res = new ResultDisplay(mark);
            
            result[i] = res;
        }
        for(int i=0;i<n;i++) {
        	total = total + result[i].getMark();
        }
        System.out.println(total);
        ResultDisplay obj = new ResultDisplay();
        int average=obj.average(total,n);
        System.out.println("\n Average of the given Marks : " +average);
        obj.display(average);
        
	}

	

}
