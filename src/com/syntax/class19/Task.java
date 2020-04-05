package com.syntax.class19;

public class Task {
//	Create 1 class with a private method that has 3 overloaded forms. 
//	Then call each overloaded method with specific arguments and observe result.
	private static void load1(int a) {
	
		System.out.println("private method with one parameter");
		
	}
	private static void load1(int a, int b) {
		System.out.println("private method with two parameter");
	}
	protected static void load1(int a, int b, int c) {
		System.out.println("protected method with three parameter");
	}
	public static void main(String[] args) {
		load1(12);
		load1(12, 13);
		load1(12, 13, 15);
		
	}
}
