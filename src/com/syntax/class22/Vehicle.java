package com.syntax.class22;

public abstract class  Vehicle {
//	Complete this diagram.
//	Create a class Bus, which will be concrete child class of the vehicle class.
//	Create a SchoolBus class that will be a subclass of the Bus and override method drive() and stop().
//	Create an array of vehicles and see which methods will be available and see the output of the program
	void start(){
		System.out.println("most of the vehicles starts by truning the key");
		
	}
	void stop() {
		System.out.println("vehicles should stop for pedisterian crosswalk");
	}
	
	abstract void brake();
	abstract void drive();

}
class Buss extends Vehicle{

	@Override
	void brake() {
		System.out.println("bus should barke at red light camera");
		
	}

	@Override
	void drive() {
		System.out.println("Bus can drive fast");
		
	}
}
class SchoolBus extends Buss{
	
	void start() {
		System.out.println("school bus start remotly");
	}
	void stop() {
		System.out.println("School bus stops for childern");
	}
}