package com.syntax.class25;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// create collection that will store only unique objects
		
	HashSet<String>	breakfast=new HashSet<>();
	
	breakfast.add("eggs");
	breakfast.add("bread");
	breakfast.add("tea");
	breakfast.add("cream Chees");
	breakfast.add("eggs");
	breakfast.add("coffee");
	
	//how many elements in the set?
	int size=breakfast.size();
	System.out.println(size);
	//order is not maintained
	System.out.println(breakfast);
	// we need to retrive an element not get method available
	
	Iterator <String> list=breakfast.iterator();
	while(list.hasNext()) {
		System.out.println(list.next());
	}
	System.out.println("===============");
	// 2nd way to retrive data only advanced for loop
	for(String fast:breakfast) {
		System.out.println(fast);
		
	}
	
	}

}
