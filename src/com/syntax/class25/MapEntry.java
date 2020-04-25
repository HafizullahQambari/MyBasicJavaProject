package com.syntax.class25;
import java.util.*;
import java.util.Map.Entry;
public class MapEntry {

	public static void main(String[] args) {
		
		// create a map that will store and days in a month
		
		Map<String, Integer> month=new LinkedHashMap<>();
		
		month.put("January", 1);
		month.put("February", 2);
		month.put("March", 3);
		month.put("April", 4);
		
		System.out.println(month.size());// number of entries
		
		//get all entries form the map
		
	Set<Entry<String, Integer>> entries=month.entrySet();
	
	for(Entry<String, Integer> entry:entries) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
		// iterator
	Iterator<Entry<String, Integer>> it=entries.iterator();
	while(it.hasNext()) {
		//System.out.println("key"+it.next().getKey());
		Entry<String, Integer> enter=it.next();
		System.out.println("key"+enter.getKey()+" value"+enter.getValue());
	}
	}
}
