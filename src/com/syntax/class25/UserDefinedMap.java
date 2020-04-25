package com.syntax.class25;
import java.util.*;
import java.util.Map.Entry;

abstract class Store{
	
	String type, name;
	
	Store(String type, String name){
		this.type=type;
		this.name=name;
	}
	public abstract void workingHours();
	
	public void display() {
		System.out.println("This is store"+name);
	}
}
class Nike extends Store{
	Nike(String type, String name){
		super(type, name);
	}
	public void workingHours() {
		System.out.println(name+" workd form 10 am to 6 pm");
	}
}

class Costco extends Store{
	Costco(String type, String name){
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name+"working form 6 am to 2 pm");
		
	}
}
class Amazon extends Store{
	Amazon(String type, String name){
		super(type, name);
	}
	@Override
	public void workingHours() {
		System.out.println(name+"working 24/7");
	}
}
public  class UserDefinedMap {
	public static void main(String[] args) {
		
		Map<Integer, Store> storeMap=new LinkedHashMap<>();
		
		storeMap.put(1, new Amazon("online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		
		System.out.println(storeMap);
		// to get values
		Collection<Store> col=storeMap.values();
		
		for(Store store:col) {
			store.workingHours();
			store.display();
			System.out.println("--------------------------");
		}
		//2nd way
		Set<Entry<Integer, Store>> storeSet=storeMap.entrySet();
		
		for(Entry<Integer, Store> s:storeSet) {
			s.getValue().workingHours();
			s.getValue().display();
		}
		// 3.way
		Set<Integer> keys=storeMap.keySet();
		
		
		for(Integer k:keys) {
			Store obj=storeMap.get(keys);
			obj.display();
			obj.workingHours();
			System.out.println("-----------------------------------");
		}
		 Iterator<Integer> k=keys.iterator();		
		 while(k.hasNext()) {
			 Integer s=k.next();
			System.out.println(s);
		 } 
	}
}
