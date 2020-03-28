package com.syntax.class15;

public class Car {
	String make, Model, color;
	int year, door, wheels;
	public void printDetails(){
		System.out.println("I have "+year+" "+make+" "+Model+" "+color+" color");
		System.out.println("I have "+year+" "+make+" "+Model+" "+color+" color"+" with " +door+" doors and "+wheels+" wheels");
	}
	Car(String carMake, String carModel, String carColor, int carYear, int carDoor, int carWheels){
		make=carMake;
		Model=carModel;
		color=carColor;
		year=carYear;
		door=carDoor;
		wheels=carWheels;
		
		
	}
	
	public static void main(String[] args) {
		Car obj=new Car("Toyota", "Corolla", "Black", 2020, 4, 4);
		
		obj.printDetails();
		
	}
}
