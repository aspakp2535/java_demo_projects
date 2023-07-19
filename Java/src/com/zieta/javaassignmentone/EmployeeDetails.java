package com.zieta.javaassignmentone;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n;
	        int count=0;

	        System.out.print("Enter the number of employees: ");
	        n = sc.nextInt();

	        Employee[] employees = new Employee[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details for employee " + (i + 1) + ":");
	            System.out.print("Employee ID: ");
	            int empId = sc.nextInt();
	            System.out.print("Name: ");
	            String empName = sc.next();
	            System.out.print("Salary: ");
	            double empSalary = sc.nextDouble();
	            System.out.print("Company: ");
	            String empCompany = sc.next();

	            Employee emp = new Employee(empId, empName, empSalary, empCompany);
	            employees[i] = emp;
	        }

	        
	        System.out.println("\nEmployee details:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Employee " + (i + 1) + ":");
	            System.out.println("ID: " + employees[i].getEmpId());
	            System.out.println("Name: " + employees[i].getEmpName());
	            System.out.println("Salary: " + employees[i].getEmpSalary());
	            System.out.println("Company: " + employees[i].getEmpCompany());
	            System.out.println("\n");
	        }
	        for (int i = 0; i < n; i++) 
	        {
	        	
	        		if (employees[i].getEmpSalary() > 50000) 
	        		{
	        			System.out.println(employees[i].getEmpId()+": " +employees[i].getEmpName() + ": " + employees[i].getEmpSalary()+ ": " + employees[i].getEmpCompany());
	        			count++;
	            }	
	    }
	        System.out.println("Total Number of employees getting more than 50k : "+count);
	        System.out.println("Total Number of employees working : "+n);
	}
}
