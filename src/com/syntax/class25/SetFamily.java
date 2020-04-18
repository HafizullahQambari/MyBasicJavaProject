package com.syntax.class25;

import java.util.*;


public class SetFamily {
	
	public static void main(String[] args) {
		
		Set<String> vegies=new HashSet<>();
		vegies.add("Carrot");
		vegies.add("potato");
		vegies.add("cucumber");
		vegies.add("eggplant");
		vegies.add("cucumber");
		
		System.out.println(vegies);
		// linkedSet guarantee insertion order
		Set<String> fruits=new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomato");
		
		System.out.println(fruits);
		
		//tree set stores objects in ascedning order
		
		Set<Object> food=new TreeSet<>(vegies);
		food.addAll(vegies);
		food.addAll(fruits);
		System.out.println(food);
	}

}
