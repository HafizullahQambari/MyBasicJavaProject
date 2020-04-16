package com.syntax.class23;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setName("hafiz");
		System.out.println("The name of employee is "+emp.getName());
		emp.setAge(65);
		System.out.println("The age of employee is "+ emp.getAge());
		emp.setSalary(75000);
		System.out.println("The salary of employee is "+emp.getSalary());
	}
	
	

}
