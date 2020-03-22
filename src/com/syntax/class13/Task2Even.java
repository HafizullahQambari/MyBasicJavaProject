package com.syntax.class13;

public class Task2Even {

	void num (int a){
		if(a%2==0) {
			System.out.println(a+"is even");
		}else {
			System.out.println(a+" is odd");
		}
	}
	public static void main(String[] args) {
		Task2Even task=new Task2Even();
		task.num(15);
		
	}
}
