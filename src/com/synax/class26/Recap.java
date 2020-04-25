package com.synax.class26;
import java.util.*;
import java.util.Map.Entry;
public class Recap {
	public static void main(String[] args) {
		
		// create countries and capitals
		Map<String, String> map=new HashMap<>();
		
		map.put("USA", "WashingtonDC");
		map.put("Russia", "Moscow");
		map.put("France", "Paris");
		map.put("Italy", null);
		map.put(null, "some value");
		map.put("Tajikistan", "Dushanbee");
		
	System.out.println(map);
	
		Set<String> key=map.keySet();
		Iterator<String> it=key.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println("country is "+str+" and its capital is "+map.get(str));
		}
		System.out.println("----------getting keys and values---------");
	Set<Entry<String, String>> entry=map.entrySet();
	
		Iterator<Entry<String, String>> iter=entry.iterator();
		while(iter.hasNext()) {
			Entry<String, String> e=iter.next();
			System.out.println(e);
		}
		System.out.println("--------getting values----------");
		Collection<String> c=map.values();
		Iterator<String> iterat=c.iterator();
		while(iterat.hasNext()) {
			System.out.println(iterat.next());
		}
		
		Map<String, String> htable=new Hashtable<>();
		htable.put("USA", "WashingtonDC");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		htable.put("Italy", null);// null values are not premited inside hastable otherwise its the same as hasMap
		htable.put(null, "some value");// null keys are not premited inside hastable otherwise its the same as hasMap
		htable.put("Tajikistan", "Dushanbee");
		
		System.out.println(htable);
		
	}

}
