package com.syntax.class25;
import java.util.*;
public class Task_1 {
	
	public static void main(String[] args) {
		/*/Create a Set collection in which you need to add names of the countries. 
		 * In this set we want all objects to be sorted in alphabetical order. 
		 * Using 2 different ways retrieve all elements from set.
		 */
		
		Set<String> country=new TreeSet();
		
		country.add("Italy");
		country.add("Iran");
		country.add("India");
		country.add("Pakistan");
		country.add("Afghanistan");
		
		System.out.println(country);
		
		System.out.println("using iterator=============");
		Iterator<String> list=country.iterator();
		while(list.hasNext()) {
			String size=list.next();
			System.out.println(size);
			
		}
		System.out.println("using advanced for loop================");
		
		for(String count:country) {
			System.out.println(count);
		}
	}

}
