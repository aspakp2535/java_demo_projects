package com.zieta.javaassignmentone;

public class Employee {
	private int empId;
    private String empName;
    private double empSalary;
    private String empCompany;

    public Employee(int empId, String empName, double empSalary, String empCompany) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empCompany=empCompany;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
    public String getEmpCompany() {
        return empCompany;
    }

}
