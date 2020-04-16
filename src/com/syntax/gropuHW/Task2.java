package com.syntax.gropuHW;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> word=new ArrayList<>();
		
		word.add("hello");
		word.add("remove");
		word.add("package");
		word.add("coding");
		
		Iterator<String> it=word.iterator();
		
		while(it.hasNext()) {
			if(it.next().endsWith("e")){
				it.remove();
			}
		}
		System.out.println(word);
	}

}
