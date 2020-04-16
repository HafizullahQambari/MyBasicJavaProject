package com.syntax.gropuHW;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<>();
		
		cars.add("corolla");
		cars.add("luxes");
		cars.add("Rav 4");
		cars.add("4Runner");
		
		
		System.out.println(cars);
		//using for loop
		
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		//using enhaced loop
		
		for(String car:cars) {
			System.out.println(car);
		}
		// using iterator
		
		Iterator<String> car=cars.iterator();
		
		while(car.hasNext()) {
			String vehicle=car.next();
			System.out.println(vehicle);
			
		}
		
		

	}

}
