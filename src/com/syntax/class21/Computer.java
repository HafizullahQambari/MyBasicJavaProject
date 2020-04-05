package com.syntax.class21;

public class Computer {
//	Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//	Define common behavior within and some fields in parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Create objects of child classes and store them into array. Loop through each object and execute available methods.
	String make;
	Computer(String make){
		this.make=make;
	}
	public void display() {
		System.out.println("I have a computer");
	}
	public void Feature() {
		System.out.println("My" +make+"computer has a nice keyboad");
	}
	public void work() {
		System.out.println(make+" works fast ");
	}
}
class Apple extends Computer{
	public Apple(String make) {
		super(make);
	}
	public void Feature() {
		System.out.println("My" +make+"computer has a nice screen");
	}
	public void work() {
		System.out.println(make+" works as fast as Dell");
	}
}
class Lenovo extends Computer{
	public Lenovo(String make) {
		super(make);
	}
	public void Feature() {
		System.out.println("My" +make+"computer has a nice mouse");
	}
	public void work() {
		System.out.println(make+" works with touching screen");
	}
}
class HP extends Computer{
	public HP(String make) {
		super(make);
	}
	public void Featur() {
		System.out.println("My" +make+"computer has a nice webcam");
	}
	public void work() {
		System.out.println(make+" work for 3 hours without pluging");
	}
}
class Dell extends Computer{
	public Dell(String make) {
		super(make);
	}
	public void Feature() {
		System.out.println("My" +make+"computer has a 16 GB RAM");
	}
	public void work() {
		System.out.println(make+" plays game with high graphic");
	}
}