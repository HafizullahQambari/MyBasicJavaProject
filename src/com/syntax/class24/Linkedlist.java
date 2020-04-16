package com.syntax.class24;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("Ali");
		list.add("Rayhan");
		list.add(1, "Farid");
		list.add("Farid");
		list.add("Farid");
		
		int size=list.size();
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			it.next();
		}
		System.out.println(list);
		System.out.println("======for loop==========");
		
		for(int i=0; i<list.size(); i++) {
			list.get(i);
		}
		System.out.println(list);
		System.out.println("======using advanced loop======");
		
		for(String name:list) {
			System.out.print(name+" ");
		}
		
	}
	
}
