package com.syntax.class14_1;

public class Baby {
	String firstName;
	String lastName;
	char gender;
	int weigth;
	String hairColor;
	
	public void walk() {
		System.out.println(" crawling");
	}
	public void cry() {
		System.out.println("crying every minute");
	}
	public void talk() {
		System.out.println("ba ba ta");
	}
		public static void main(String[] args) {
	Baby baby1=new Baby();
	baby1.firstName="mike";
	baby1.lastName="Rober";
	baby1.gender='M';
	baby1.hairColor="brown";
	baby1.weigth=8;
	
	baby1.walk();
	baby1.cry();
	baby1.talk();
	
	
	
}
}
