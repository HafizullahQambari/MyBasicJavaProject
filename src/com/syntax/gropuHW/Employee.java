package com.syntax.gropuHW;

public class Employee {
	private String fullName;
	private String ssn;
	private double salary;
	
	public Employee(String fullName, String ssn, double salary) {
		this.fullName=fullName;
		this.ssn=ssn;
		this.salary=salary;
	}
	public String getFullName() {
		return fullName;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public double getSalary() {
		return salary;
	}	
	
}
