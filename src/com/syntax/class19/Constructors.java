package com.syntax.class19;

public class Constructors {
	
	
	
	Constructors(){
		this(1);
		System.out.println("Hi 3");
	}
	Constructors(int x){
		this(1, 2);
		System.out.println("How are you 2");
		}
	Constructors(int x, int y){
		System.out.println("Hello 1");
	}
	public static void main(String[] args) {
		
		Constructors obj=new Constructors();
	}
	

}
