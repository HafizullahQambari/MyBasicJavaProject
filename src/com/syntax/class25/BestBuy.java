package com.syntax.class25;
import java.util.*;
import java.util.Map.Entry;
public class BestBuy {
	public static void main(String[] args) {
		
		Map<String, Integer> item=new HashMap<>();
		
		item.put("Hp", 1500);
		item.put("Lenovo", 1200);
		item.put("keyboard", 120);
		item.put("Acer", 2000);
		
		Set<Entry<String, Integer>> electronics=item.entrySet();
		
		Iterator<Entry<String, Integer>>it=electronics.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> s=it.next();
			System.out.println(s.getKey()+" "+s.getValue());
		}
		System.out.println("_______________");
		for(Entry<String, Integer> k:electronics) {
			System.out.println(k.getKey()+":"+k.getValue());
		}
		
	}

}
