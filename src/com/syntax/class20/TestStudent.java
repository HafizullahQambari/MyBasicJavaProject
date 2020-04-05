package com.syntax.class20;

public class TestStudent {
	public static void main(String[] args) {
		Student st=new Student();
		st.eat();
		st.study();
		
		SyntaxStudent sy=new SyntaxStudent();
		
		sy.eat();
		sy.study();// overrided
		
		CollegeStudent cg=new CollegeStudent();
		cg.eat();
		cg.study();// overrided
		
		Student st1=new SyntaxStudent();// run time polymorphism
		st1.eat();
		st1.study();
	}

}
