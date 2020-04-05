package com.syntax.class20;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.salary=10000;
		emp.getPaid();
		
		PartTimeEmployee pt=new PartTimeEmployee();
		pt.salary=8000;
		pt.getPaid();
		
		Contractor ct=new Contractor();
		ct.hourlyRate=50;
		ct.getPaid();
	}

}
