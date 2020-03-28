package com.syntax.class15;

public class Car {
	String make, Model, color;
	int year;
	public void printDetails(){
		System.out.println("I have "+year+" "+make+" "+Model+" "+color+" color");
	}
	public static void main(String[] args) {
		Car car1=new Car();
		car1.printDetails();
		
	}
}
