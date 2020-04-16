package com.syntax.class24;
import java.util.ArrayList;
import java.util.Iterator;
public class TestInsurance {
	public static void main(String[] args) {
		
		ArrayList<Insurance> insur=new ArrayList<>();
		insur.add(new Car("State Farm", "Corolla"));
		insur.add(new Pet("GEICO", "Dog"));
		insur.add(new Health("Care First"));
	System.out.println("======using iterator=====");
	Iterator<Insurance> insurance=insur.iterator();
	while(insurance.hasNext()) {
	Insurance list=insurance.next();
	list.getQuote();
	list.cancelInsurance();
		
	}
	System.out.println("=====using for loop====");
	for(int i=0; i<insur.size(); i++) {
		insur.get(i).getQuote();
		insur.get(i).cancelInsurance();
	}
	System.out.println("==========using enhanced loop=====");
	for(Insurance list:insur) {
		list.getQuote();
		list.cancelInsurance();
	}
	}

}
