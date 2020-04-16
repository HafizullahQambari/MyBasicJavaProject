package com.syntax.class24;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {
	public static void main(String[] args) {
		
		//Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.
		
		ArrayList<Integer> even=new ArrayList<>();
		for(int i=0; i<=50; i++) {
			if(i%2==1) {
				
				even.add(i);
			}
		}
		Iterator<Integer> num=even.iterator();
		while(num.hasNext()) {
			if(num.next()%5==0) {
				
				num.remove();
			}
		}
		System.out.println(even);
	}
}
