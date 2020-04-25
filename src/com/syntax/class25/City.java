package com.syntax.class25;
import java.util.*;
import java.util.Map.Entry;

public class City {
	public static void main(String[] args) {
		//Create a Map from array of cities that will sort keys in alphabetical order.
		//As a key store the name of the city and as a value store the length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
		//If any city name is more than 7 characters remove that city .
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("Paris", 5);
		map.put("Moscow", 6);
		map.put("WashingtonDC", 13);
		map.put("New York", 10);
	Set<Entry<String, Integer>> k=map.entrySet();
	
	Iterator<Entry<String, Integer>> entry=k.iterator();
	while(entry.hasNext()) {
		String enter=entry.next().getKey();
		
		if(enter.length()>7) {
			entry.remove();
			
		}
	}
	System.out.println(map);
	
	}
}
