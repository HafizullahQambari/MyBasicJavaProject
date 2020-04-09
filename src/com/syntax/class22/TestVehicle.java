package com.syntax.class22;

public class TestVehicle {
	public static void main(String[] args) {
		
		Vehicle[] va= {new SchoolBus()};
		
		for(int i=0; i<va.length; i++) {
			va[i].brake();
			va[i].drive();
			va[i].start();
			va[i].stop();
		}
		
		
	}

}
