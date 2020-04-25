package com.syntax.class25;

import java.util.*;

public class Task_3 {
	public static void main(String[] args) {
		//Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. Display name of each student.
		
	Map<String, String>	student=new HashMap<>();
	student.put("Ali", "235645");
	student.put("Faisal", "23564");
	student.put("Hafiz", "23245");
	
	System.out.println(student);

	Set<String> setKeys =student.keySet();
	
	for(String key:setKeys) {
		System.out.println(key);
	}
	
	
	}

}
