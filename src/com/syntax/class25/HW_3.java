package com.syntax.class25;
import java.util.*;
public class HW_3 {

	public static void main(String[] args) {
		// Create the collection that will store single uniques Objects of a String type in which order is preserved.
		// Write a logic to concatenate all string from the collection.
		
		Set<String> sen=new LinkedHashSet<>();
		
		sen.add("how");
		sen.add("are");
		sen.add("you");
		sen.add("doing");
		sen.add("buddy!");
		
		for(String s:sen) {
			System.out.print(s+" ");
		}
		

	}

}
