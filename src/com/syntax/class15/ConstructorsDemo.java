package com.syntax.class15;

public class ConstructorsDemo {
	static String str="Hello";
	ConstructorsDemo(){
		
		System.out.println("I am your constructor");
		System.out.println("I am non arguments constructor");
	}
	
	ConstructorsDemo(String str){
		System.out.println("I am a constructor with parameter");
		
	}
	ConstructorsDemo(int num){
		System.out.println(" with integer value");
	}
	ConstructorsDemo(String s, int num){
		System.out.println(" with String and integer");
	}
	
	
	
	
	public static void main(String[] args) {
		ConstructorsDemo obj= new ConstructorsDemo();
		ConstructorsDemo obj1=new ConstructorsDemo("it rainy day");
		ConstructorsDemo obj2= new ConstructorsDemo( 12);
		ConstructorsDemo obj3=new ConstructorsDemo("yes", 13);
		
		
	}

}
