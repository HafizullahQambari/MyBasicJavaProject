package com.syntax.class24;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFood {

	public static void main(String[] args) {
		// create a collection of food and using 3 ways execute methods
		
		ArrayList<Food> food=new ArrayList<>();
		food.add(new Afghan());
		food.add(new Pakistan());
		food.add(new Iran());
		food.add(new Tajikistan());
		System.out.println("========using advanced for loope accessing the methods================");
		for(Food f:food) {
			f.cook();
			f.eat();
			f.delicious();
		}
		System.out.println("======using Iterator accessin the methods=========");
		Iterator<Food> tast=food.iterator();
		while(tast.hasNext()) {
			Food f=tast.next();
			f.cook();
			f.eat();
			f.delicious();
		}
		System.out.println("===========using regular for loop===========");
	for(int i=0; i<food.size(); i++) {
		food.get(i).cook();
		food.get(i).eat();
		food.get(i).delicious();
	}
		
	}
}
