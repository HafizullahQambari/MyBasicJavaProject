package com.syntax.class18;

public class RecapConstructors {
	
	RecapConstructors(){
		System.out.println("constructors with no arguments");
	}
	RecapConstructors(int num){
		System.out.println("Constructors with parameter");
	}
	public static void main(String[] args) {
		RecapConstructors obj=new RecapConstructors();
		RecapConstructors obj1=new RecapConstructors(2);
	}
}
