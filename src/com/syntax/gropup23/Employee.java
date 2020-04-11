package com.syntax.gropup23;

public class Employee {
	private String name;
	private int age;
	private double salary;
	
	//define public methods to give an access to private variables
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
		
	}
	public void setName(String name) {
		if(!name.isEmpty() && name.length()>3) {
			this.name=name;
		}
		
	}
	public void setAge(int age) {
		if(age<70 || age>18) {
			this.age=age;
		}
		
	}
	public void setSalary(double salary) {
		if(salary>100000 || salary<90000)
		this.salary=salary;
		
	}
}

