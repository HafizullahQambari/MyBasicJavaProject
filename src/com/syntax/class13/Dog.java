package com.syntax.class13;

public class Dog {
	
	String name="";
	String color="";
	String breed="";
	int age;
	// define behavior
	
	void bark() {
		System.out.println(name+" can bark");
	}
	void walk(){
		System.out.println(name+" can dance");
		
	}void eat(){
		System.out.println(name+" can eat");
	}
	
	public static void main(String[] args) {
		
	Dog dog1=new Dog();
	
	dog1.name="tania";
	dog1.color="white";
	dog1.breed="shih tzu";
	dog1.age=1;
	dog1.bark();
	dog1.eat();
	dog1.walk();
		
	 Dog dog2=new Dog();
	 
	 dog2.name="Marwa";
	 dog2.color="brown";
	 dog2.breed="german";
	 dog2.age=20;
	 dog2.bark();
		dog2.eat();
		dog2.walk();
	 
	 System.out.println("Dog 1 name "+ dog1.name);
	 System.out.println("Dog 2 name "+ dog2.name);
	}

}
