package com.syntax.class25;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> info=new HashMap<>();
		
		info.put("Name", "John");
		info.put("last Name", "Smith");
		info.put("Address", "123 test");
		info.put("city", "chantily");
		
		// how to check if map has values
		boolean map=info.isEmpty();
		System.out.println("is map empty: "+map);
		
		// how many elements are in the map
		int size=info.size();
		System.out.println("how many elements in the map: "+size);
		// add more values
		info.put("zip code", "22193");
		// store duplicat values?No, the previuos value will be replaced
		info.put("Name", "Jane");
		System.out.println(info);
		//how to access the value?==> use method get and specify the key
		
		System.out.println(info.get("Name"));
		// remove 
		System.out.println(info.remove("Address"));
		// replace values in map
		info.replace("zip code", "22192");
		System.out.println(info);
	}

}
