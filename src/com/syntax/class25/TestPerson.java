package com.syntax.class25;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Map<Integer, Person> map=new TreeMap<>();
		
		map.put(1, new Person("David", "Beckham", 35, 150000.0));
		map.put(2, new Person("Saif", "kakar", 50, 120000.0));
		map.put(3, new Person("Yasser", "salah", 3, 130000.3));
		
		
		Set<Integer> key=map.keySet();
		for(int k:key) {
			Person m=map.get(k);
			m.display();
			
		}
		
		
	}

}
