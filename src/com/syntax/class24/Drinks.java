package com.syntax.class24;
import java.util.ArrayList;
import java.util.Iterator;
public class Drinks {
	//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
	
	public static void main(String[] args) {
	ArrayList<String> drink=new ArrayList<>();
	
	drink.add("water");
	drink.add("tea");
	drink.add("coffee");
	drink.add("milk");
	drink.add("maccoffee");
	
	Iterator<String> d=drink.iterator();
	while(d.hasNext()) {
		String shoop=d.next();
		if(shoop.contains("a") || shoop.contains("e")) {
			String sh=shoop.replaceAll(shoop, "water");
			System.out.println(sh);
		}
	}
	}
	

}
