package com.syntax.class24;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListRecap {
	public static void main(String[] args) {
		// lets creat arrayList that stores double type of objects
		
		
	ArrayList<Double> array=new ArrayList<>();
	array.add(10.99);
	array.add(12.90);
	array.add(100.0);
	
	
	System.out.println(array);
	array.set(1, 13.90);// to replace element
	System.out.println(array);
	
	// remove element
	array.remove(13.90);
	System.out.println(array);
	
	
	
	// to retrive single element 
	
	System.out.println(array.get(1));
	
	for(Double num:array) {
		System.out.println(num);
	}
	System.out.println("===========non generic collection===========");
	// 2. non generic collection/arraylist
	ArrayList obj=new ArrayList();
	obj.add("hello");// store single object
	obj.add(100);
	obj.add('c');
	obj.addAll(array);// store collection object
	
	System.out.println(obj);
	
	//1. retrive all elements using enhanced loop
	for(Object o:obj) {
		System.out.println(o);
	}
	
	//2. retrive all elements using for loop
	for(int i=0; i<array.size(); i++) {
		double d=array.get(i);
		System.out.println(d);
		
	}
	//3. printing all elements using iterator
	Iterator<Double> iterator=array.iterator();
	while(iterator.hasNext()) {
	double d=iterator.next();
	System.out.println(d);
	
	}
	
	}
}
