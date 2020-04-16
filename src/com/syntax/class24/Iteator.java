package com.syntax.class24;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteator {

	public static void main(String[] args) {
		// create an arraylist of chocolate
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("kinder");
		list.add("godvia");
		list.add("kit kat");
		list.add("snikers");
		
		//create arraylist of sweets
		
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("Ice cream");
		sweets.add("chees cake");
		
		sweets.addAll(list);
		
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		// using iterator print all data
		
		Iterator<String> it=sweets.iterator();
		while(it.hasNext()) {
			String element=it.next();
			
			if(element.equals("Ice cream")) {
				it.remove();
			}
			
		}
		System.out.println("array after remvoing fucntion");
		System.out.println(sweets);
		
		// to get elements the backwards
		
		for(int i=sweets.size()-1; i>=0; i--) {
			System.out.println(sweets.get(i)+";");
		}
		// advance for loop iterats/loops in 1 direction
		for(String candy:sweets) {
			System.out.println(candy);
		}

	}

}
