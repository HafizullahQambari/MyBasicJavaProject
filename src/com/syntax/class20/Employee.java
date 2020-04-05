package com.syntax.class20;

public class Employee {
	double salary;
	void getPaid() {
		System.out.println("Employee get paid "+salary);
	}
	void work() {
		System.out.println("Employee work har");
	}

}
class FullTimeEmployee extends Employee{
	
}
class PartTimeEmployee extends FullTimeEmployee{
	
}
class Contractor extends PartTimeEmployee{
	double hourlyRate;
	void getPaid() {
		System.out.println("Employee get paid"+hourlyRate);
	}
}