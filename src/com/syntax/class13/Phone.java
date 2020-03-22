package com.syntax.class13;

public class Phone {
	
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.

	String make="";
	String model="";
	int year;
	
	//define behaviour
	
	void call() {
		System.out.println(make+" make call");
		
	}
	void video() {
		System.out.println(make+ " show videos");
	} 
	void playGame() {
		System.out.println(make+ "can play game");
	}
	public static void main(String[] args) {
		
		 Phone phone1=new Phone();
		 phone1.make="Iphone";
		 phone1.model="XR";
		 phone1.year=2014;
		
		 
		 System.out.println("I like "+phone1.make +" "+phone1.model+" because it can do the following");
		 
		 
		 phone1.call();
		 phone1.video();
		 phone1.playGame();
		 
		 
		 
		 
	}
}
