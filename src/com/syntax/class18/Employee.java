package com.syntax.class18;

public class Employee {
	static String company;
	int empNumber;
	double salary;
	void getPaid() {
		System.out.println("Employee get "+salary);
	}
	static void work(String company) {
		System.out.println("Employee wort at "+company);
		
	}
	

}
