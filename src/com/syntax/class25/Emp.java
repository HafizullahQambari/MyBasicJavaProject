package com.syntax.class25;
import java.util.*;
import java.util.Map.Entry;
public class Emp {

	public static void main(String[] args) {
//		Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. 
//		Output should be in the below format
//		John Smith=$100000
		
		Map<String, Double> emp=new LinkedHashMap<>();
		emp.put("sumair", 150000.0);
		emp.put("joh Smith", 120000.0);
		emp.put("Asel", 250000.0);
		
		double maxSalary=Collections.max(emp.values());
		Set<Entry<String, Double>> enter=emp.entrySet();

		for(Entry<String, Double> k:enter) {
			if(k.getValue()==maxSalary) {
				System.out.println(k.getKey()+"=$"+k.getValue());
			}
			
		}
	}

}
