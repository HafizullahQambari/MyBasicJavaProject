package com.syntax.class15;

public class Task1 {
	//Write a program that will have a constructor: one with parameters and second without any parameters. 
	// Create a separate Test class where you will execute both of the constructors.
	Task1(String c){
	System.out.println("I am with parameter");
}
	Task1(){
	System.out.println(" I am without parameter");
}
	public static void main(String[] args) {
		Task1 obj1=new Task1("its a rainy day");
		Task1 obj2=new Task1();
		
	}
}
