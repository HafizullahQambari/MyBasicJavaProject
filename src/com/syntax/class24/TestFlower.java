package com.syntax.class24;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flower[] flower= {new Rose("Rose"), new Sunflower("sunflower"), new Tulip("tulip")};
		
		
		ArrayList<Flower> flowers=new ArrayList<>();
		
		
	flowers.add(new Rose("Rose"));
	flowers.add(new Sunflower("sunflower"));
	flowers.add(new Tulip("tulip"));
	
	System.out.println("======using iterator accessing methods");
	
	Iterator<Flower> f=flowers.iterator();
	while(f.hasNext()) {
		f.next().bloom();
	}
	System.out.println("========using for loop========");
	
	for(int i=0; i<flowers.size(); i++) {
		flowers.get(i).bloom();
		
	}
	System.out.println("=========using advanced for loop========");
	
	for(Flower r:flowers) {
		r.bloom();
		
	}
	
	

	}

}
