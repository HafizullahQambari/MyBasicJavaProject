package com.syntax.class25;
import java.util.*;

public class Task {
	public static void main(String[] args) {
		
		 Map<String, String> countries=new TreeMap<>();
		 
		 countries.put("USA", "WashingtonDC");
		 countries.put("Russia", "Moscow");
		 countries.put("India", "New Delhi");
		 countries.put("Pakistan", "Islam Abad");
		 countries.put("Tajikistan", "Dushanbee");
		 countries.put("Afghanistan", "Kabul");
		 System.out.println(countries);
		 
		 Set<String> key=countries.keySet();
		 
		 Iterator<String> k=key.iterator();
		 while(k.hasNext()) {
			 String country=k.next();
			 System.out.println("countrye is"+country+" and the capital is "+countries.get(country));
		 }
		 
		 Collection<String> c=countries.values();
		 
		 for(String capital:c) {
			 System.out.println(capital);
		 }
		Iterator<String> capital=c.iterator();
		while(capital.hasNext()) {
			System.out.println(capital.next());
		}
		
		 
		
	}

}
