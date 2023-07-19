package com.zieta.corejava;

import java.util.Arrays;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

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

            Employee emp = new Employee(empId, empName, empSalary);
            employees[i] = emp;
        }

        
        System.out.println("\nEmployee details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("ID: " + employees[i].getEmpId());
            System.out.println("Name: " + employees[i].getEmpName());
            System.out.println("Salary: " + employees[i].getEmpSalary());
            System.out.println("\n");
        }
//        Arrays.sort(employees, (a, b) -> Double.compare(b.getEmpSalary(), a.getEmpSalary()));
        for (int i = 0; i < n; i++) 
        {
        	for (int j = i + 1; j< n; j++) 
        	{
        		if (employees[i].getEmpSalary() < employees[j].getEmpSalary()) 
        		{
	                Employee temp = employees[i];
	                employees[i] = employees[j];
	                employees[j] = temp;
            }
        }
        	
    }
        
        
        System.out.println("\n\nFirst 3 maximum salaries:");
        for (int i = 0; i < Math.min(3, n); i++) {
            System.out.println(employees[i].getEmpId()+": " +employees[i].getEmpName() + ": " + employees[i].getEmpSalary());
        }
    }
}
