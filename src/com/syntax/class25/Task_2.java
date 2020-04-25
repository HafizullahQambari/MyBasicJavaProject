package com.syntax.class25;

import java.util.*;

public class Task_2 {
	public static void main(String[] args) {
		
		/*/Create a Set of cities in which you want to make sure that insertion order is maintained. 
		 * Using Iterator remove any city that starts with “A”;
		 */
		
		ArrayList<String> cities=new ArrayList<>();
		cities.add("New York");
		cities.add("San Francisco");
		cities.add("paris");
		cities.add("Washington DC");
		cities.add("Baltimor");
		cities.add("Alberta");
		cities.add("New York");
		
		System.out.println(cities);
		Set<String> set=new LinkedHashSet<>();
		set.addAll(cities);
		System.out.println(set);
		
		set.add("Mehar");
		set.add("yasser");
		
		if(set.contains("Mehar")) {
			System.out.println("we have mehar");
		}
		
		List<String> list=new ArrayList<>(set);
		String name=list.get(7);
		System.out.println(name);
		
		Iterator<String> city=cities.iterator();
		while(city.hasNext()) {
			if(city.next().startsWith("A")) {
				city.remove();
			}
			
		}
		System.out.println(cities);
	}

}
