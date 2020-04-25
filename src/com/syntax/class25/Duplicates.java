package com.syntax.class25;
import java.util.*;

public class Duplicates {
	public static void main(String[] args) {
		//Create a collection of integers in which you can keep duplicates. 
		//Write a logic to find sum of all integers
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(1);
		
		Iterator<Integer> it=list.iterator();
		int sum=0;
		while(it.hasNext()) {
			int num=it.next();
			sum=sum+num;
			
		}
		System.out.print(sum);
	}

}
