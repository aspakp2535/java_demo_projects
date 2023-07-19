package com.zieta.javaassignmenttwo;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class UseOfReference {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 30);
        Employee emp2 = emp1; // change the reference

        System.out.println("Employee 1: " + emp1);
        System.out.println("Employee 2: " + emp2);

        Employee emp3 = getEmployee(); // return reference
        System.out.println("Employee 3: " + emp3);

        changeEmployee(emp1); // pass reference as argument
        System.out.println("Employee 1 after change: " + emp1);
    }

    public static Employee getEmployee() {
        return new Employee("Jane Doe", 25);
    }

    public static void changeEmployee(Employee emp) {
        emp.setName("Alice");
        emp.setAge(35);
    }
}

