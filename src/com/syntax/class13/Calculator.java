package com.syntax.class13;

public class Calculator {
	void add (int a, int b){
		System.out.println(a+b);
	}void sub(int a, int b){
		System.out.println(a-b);
	}void multi(int a, int b){
		System.out.println(a*b);
	}void div(int a, int b){
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		
		Calculator calc=new Calculator();
		calc.add(15,15);
		calc.div(20, 5);
		calc.multi(2, 5);
	}

}
