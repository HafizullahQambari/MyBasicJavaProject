package com.syntax.class24;

public abstract class Food {

	
		// hw create food class that will have 3 undefined methods and it will have 4 subclasses; 
		// create a collection of food and using 3 ways execute methods
		
		abstract void cook();
		abstract void eat();
		abstract void delicious();
	}
class Afghan extends Food{
	@Override
	void cook() {
		System.out.println("Afghans cook Rice");
	}
	@Override
	void eat() {
		System.out.println("Afghans like to eat qabli palaw");	
	}
	@Override
	void delicious() {
		System.out.println("there are delicious foods in Afghan culture");	
	}
}
class Pakistan extends Food{
	
	void cook() {
		System.out.println("Pakistani people cook dall");
	}
	void eat() {
		System.out.println("Pakistani people eat dall");
	}
	void delicious() {
		System.out.println("Dall is a deliciuos food in pakistan");
	}
}
class Iran extends Food{
	
	void cook() {
		System.out.println("Iranian people like Abgosht");
	}
	void eat() {
		System.out.println("Iranian people eat potato salad");
	}
	void delicious() {
		System.out.println("Abgosht is a deliciuos food in Iran");
	}
}
class Tajikistan extends Food{
	
	void cook() {
		System.out.println("Tajik people mostly cook Ash");
	}
	void eat() {
		System.out.println("most of the people in tajikistan like to eat Ash");
	}
	void delicious() {
		System.out.println("Ash is a deliciuos food in Tajikistan");
	}
}
