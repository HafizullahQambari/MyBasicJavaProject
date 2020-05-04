package com.syntax.class28;

public class Task2 {
	
	public static void userName(String userName) {
		
		if(userName.length()<5) {
			throw new RuntimeException(" your user name should not be less than five character");
		}else {
			System.out.println("your user name is has successfully accepted");
		}
	}
	public static void main(String[] args) {
		
		userName("mike");
		userName("lkdjldjlskdjf");
	}

}
