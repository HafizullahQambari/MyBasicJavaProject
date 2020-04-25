package com.syntax.class25;
import java.util.*;
public class HW {

	public static void main(String[] args) {
		// Create a map of a building. Store floor number and it is associated company name. 
		//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
//		Check how many entries you have?
//		Update company on a 4th floor 
//		Remove company on the 7th floor
//		Print your map
		Map<String, Integer> floor=new HashMap<>();
		floor.put("Google", 1);
		floor.put("Syntax", 2);
		floor.put("NPR", 3);
		floor.put("CNN", 4);
		floor.put("Amazon", 5);
		floor.put("Ebay", 6);
		floor.put("Youtube" , 7);
		floor.put("Google", 1);
		floor.put("CBN", 2);
		System.out.println(floor.size());
		floor.put("Tek sloutions", 4);
		System.out.println("updatding the floor 7");
		floor.remove("GMC", 7);
		System.out.println(floor);
		Map<String, Integer> newfloor=new TreeMap<>(floor);
		System.out.println(newfloor);
		System.out.println("getting keys=============== ");
		Set<String> list=newfloor.keySet();
		for(String List:list) {
			System.out.println(List);
		}
		System.out.println("getting values============");
		Map<String, Integer> newlist=new HashMap<>(newfloor);
		System.out.println(newlist.values());
		System.out.println(newlist);
		System.out.println(newlist.entrySet());
		
		
		
		
	}

}
