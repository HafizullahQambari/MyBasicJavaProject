package com.syntax.gropuHW;
import java.util.*;


public class ReplPractice {
	
//	Create a Method in Main class using below specification. 
//	Method Name: Display. 
//	Return Type: Void
//	Parameters : Map<String,Integer>
//	Logic: 
//	First the method will check the given map is empty or not. 
//	If the map is not empty print pairs of key and value using loops
//	If map is empty simply print "map is empty"
	
	public static void display(Map<String, Integer> e) {
		if(e.isEmpty()){
		System.out.println("map is Empty");
	}else {
		e.forEach((k,v)->System.out.println(k+" = "+v));
	}
		
		
		
	}
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		 map.put("mango", 10); 
		 map.put("apple", 30); 
		 map.put("orange", 20); 

		display(map);
		map.clear();
		display(map);
	}
	
	
}