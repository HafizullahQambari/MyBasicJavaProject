package com.syntax.class19;

public class JavaTeacher extends Teacher{

	//compiler will try to create default constructor
	//and make a call inside to parent class default constructo
//	JavaTeacher(){
//		super();
//	}

	String certifications;

	JavaTeacher(String name, String lastName, String certification){
		super(name, lastName);
		this.certifications=certification;
	}

	JavaTeacher(String name, String lastName){
		super(name, lastName);
	}
}
