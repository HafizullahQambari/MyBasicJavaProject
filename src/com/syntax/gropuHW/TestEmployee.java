package com.syntax.gropuHW;
import java.util.*;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Employee> set=new LinkedHashSet<>();
		
		set.add(new Employee("John Doe", "123456789", 80000.0));
		set.add(new Employee("Jane Smith","987654321", 90000.0));
		set.add(new Employee("Jackie Chan", "0", 1000000.0));
		
		for(Employee s:set) {
			System.out.println(s.getFullName());
			System.out.println(s.getSsn());
			System.out.println(s.getSalary());
		}
		
		
		}
		
	}

