package com.syntax.class22;

public class TestDrivable {

	public static void main(String[] args) {
		
		Drivable obj=new Cars();
		//Drivable.MOVE_FAST=false;
		obj.drive();
		
		Cars car=new Cars();
		car.drive();
		car.stop();

	}
}
