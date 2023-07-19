package com.zieta.demopurpose;

public class Employee {
public int id;
public String name;
public int salary;
public String company;
public Employee(int id,String name,int salary,String company) {
this.id=id;
this.name=name;
this.salary=salary;
this.company=company;
}
public int getid() {
return id;
}
public String getname() {
return name;
}
public int getsalary() {
return salary;
}
public String getCompany() {
return company;
}
}
