package com.syntax.class15;

public class Task3 {
	// Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
	//1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
	
	
	public Task3() {
		System.out.println("I can be accessible everywhere whithin the project");
	}
	protected Task3(int a, int b) {
		System.out.println("I can be accessible whithin the same package");
	}
	 Task3(String s) {
		System.out.println("I can be accessible whiting the same package");
	}
	private Task3(String a, String b) {
		System.out.println("I can be accessible whithin the same class only");
	}
	
	
	public static void main(String[] args) {
		
		Task3 task1=new Task3();
		Task3 task2=new Task3(20, 20);
		Task3 task3=new Task3("How are you");
		Task3 task4=new Task3("I am", "doing well");
		
	}
}
