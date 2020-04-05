package com.syntax.class18;

public class Student {
	
	String name;
	String Address;
	
	Student(String name, String Address){
		this.name=name;
		this.Address=Address;
	}
	void displayinfo() {
		System.out.println("Student name is: "+name);
		System.out.println("Address is: "+Address);
	}
	public static void main(String[] args) {
		Student obj=new Student("Mehar", "15004 Lutz Court Woodbridge VA 22193");
		obj.displayinfo();
	}
}
