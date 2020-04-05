package com.syntax.class19;

public class Shape {
////	Create 1 class in which create a methods that will calculate the area (volume) of 
//	Rectangle
//	Square
//	Box
	
	public static int area(int a, int b) {
		int areaR=a*b;
		System.out.println("Area of Rectangle is equal to "+areaR);
	return areaR;
		
	}
	public static int  area(int a) {
		int areaS=a*a;
		System.out.println("Area of Square is equal to "+areaS);
		return areaS;
	}
	public static int area(int a, int b, int c) {
		int areaB=a*b*c;
		System.out.println("Area of Box is equal to "+areaB);
		return areaB;
	}
	

}
