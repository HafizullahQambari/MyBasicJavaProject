package com.syntax.class21;

public class Car {
	String make;
	Car(String make){
		this.make=make;
	}
	
	public void display() {
		System.out.println("I have "+make);
	}
	public void start() {
		System.out.println(make+" starts with key");
	}

}
class BMW extends Car{
	public BMW(String make) {
		super(make);
	}
	public void start() {
		System.out.println(make+" starts with pushing button");
	}
	public void navigate() {
		System.out.println(make+" has nice lights");
	}
}
class Mercedes extends Car{
	public Mercedes(String make) {
		super(make);
	}
	public void start() {
		System.out.println(make+" starts remotly");
	}
}
class Honda extends Car{
	public Honda(String make) {
		super(make);
	}
	public void start() {
		System.out.println(make+" start with turning the key");
	}
}
