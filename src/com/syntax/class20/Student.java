package com.syntax.class20;

public class Student {
//	Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//	Define common behavior within parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism
	
	
	
void eat() {
	
	System.out.println("students shouldn't eat in the class ");
}

void study() {
	System.out.println("student should study alot");
}
}

class SyntaxStudent extends Student{
	
	
	
	void study() {
		System.out.println("syntax students study hard");
	}
}
class CollegeStudent extends Student{
	
	
	
	 void study() {
		 System.out.println("college students don't study hard");
	 }
}


