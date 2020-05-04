package com.syntax.class28;


public class Task {
	public static void main(String[] args) {
		License(78);
	}
	public static void License(int age) {
		
		if(age<16 || age>65) {
			
			throw new RuntimeException("your not eligible to get a driver license");
		}
		System.out.println("end of the program");
	}
}
	
	


