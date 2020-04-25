package com.syntax.class25;
import java.util.*;
public class AllMaps {
	public static void main(String[] args) {
		
		// lets create a grocery map
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		
		System.out.println(grocery);
		// creat a map of items to buy( item, quantity) in which we want save
		
		Map<String, Integer> item=new LinkedHashMap<>();
		item.put("lysol", 2);
		item.put("sanitizer", 2);
		item.put("paper towel", 3);
		item.put("toilet paper", 10);
		item.put("face mask", 50);
		System.out.println(item);
		// create a map in which we store in ascending order
		
		Map<String, Integer> shooping=new TreeMap<>(item);
		shooping.putAll(item);
		System.out.println(shooping);
		
		// get all keys
		
		Set<String> key=item.keySet();
		
		for(String k:key) {
			System.out.println(k);
		}
		System.out.println("-------------------");
		// get all keys using iterator
		Iterator<String> key1=key.iterator();
		while(key1.hasNext()) {
			System.out.println(key1.next());
		}
		//get all value
		Collection<Integer> val=shooping.values();
		
		for(int Val:val) {
			System.out.println(Val);
		}
		System.out.println("----------------");
	Iterator<Integer> ob=val.iterator();
	while(ob.hasNext()) {
		System.out.println(ob.next());
	}
	}

}
