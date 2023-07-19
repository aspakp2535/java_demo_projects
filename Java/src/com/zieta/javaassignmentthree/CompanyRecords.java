package com.zieta.javaassignmentthree;

import java.util.Scanner;

public class CompanyRecords {
    private int[] cId;
    private String[] name;
    private String[] city;
    private double[] turnover;
    private int[] employees;

    // Constructor to initialize the arrays with user input
    public CompanyRecords(int size) {
        cId = new int[size];
        name = new String[size];
        city = new String[size];
        turnover = new double[size];
        employees = new int[size];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Company #" + (i+1) + ":");
            System.out.print("ID: ");
            cId[i] = input.nextInt();
            input.nextLine(); // clear buffer
            System.out.print("Name: ");
            name[i] = input.nextLine();
            System.out.print("City: ");
            city[i] = input.nextLine();
            System.out.print("Turnover: ");
            turnover[i] = input.nextDouble();
            System.out.print("Number of employees: ");
            employees[i] = input.nextInt();
        }
    }

    // Method to display all company records
    public void displayAll() {
        System.out.println("All companies:");
        for (int i = 0; i < cId.length; i++) {
            System.out.println("ID: " + cId[i] + ", Name: " + name[i] + ", City: " + city[i] +
                    ", Turnover: " + turnover[i] + ", Employees: " + employees[i]);
        }
    }

    // Method to display companies with more than 100 employees
    public void displayEmployees() {
        System.out.println("Companies with more than 100 employees:");
        for (int i = 0; i < cId.length; i++) {
            if (employees[i] > 100) {
                System.out.println("ID: " + cId[i] + ", Name: " + name[i] + ", City: " + city[i] +
                        ", Turnover: " + turnover[i] + ", Employees: " + employees[i]);
            }
        }
    }

    // Method to display companies from Patan
    public void displayCity() {
        System.out.println("Companies from Patan:");
        for (int i = 0; i < cId.length; i++) {
            if (city[i].equalsIgnoreCase("Patan")) {
                System.out.println("ID: " + cId[i] + ", Name: " + name[i] + ", City: " + city[i] +
                        ", Turnover: " + turnover[i] + ", Employees: " + employees[i]);
            }
            else
            	System.out.println("No Companies available in Patan");
        }
    }

    // Method to display companies with turnover between 1000 and 10000
    public void displayTurnover() {
        System.out.println("Companies with turnover between 1000 and 10000:");
        for (int i = 0; i < cId.length; i++) {
            if (turnover[i] >= 1000 && turnover[i] <= 10000) {
                System.out.println("ID: " + cId[i] + ", Name: " + name[i] + ", City: " + city[i] +
                        ", Turnover: " + turnover[i] + ", Employees: " + employees[i]);
            }
        }
    }

    // Main method to create object of CompanyRecords class and call methods
    public static void main(String[] args) {
        CompanyRecords records = new CompanyRecords(3);
        records.displayAll();
        records.displayEmployees();
        records.displayCity();
        records.displayTurnover();
    }
}

