package com.syntax.class19;

public class CallConstructor {
	public CallConstructor() {
		System.out.println("with parameter");
	}
	public CallConstructor(String str) {
		this();// using this() we can call a constructor from the same class
	}
	
	public CallConstructor(String str, String str1) {
		this(str);
	}
	
	public static void main(String[] args) {
		// creating object by passing two string values
		CallConstructor obj=new CallConstructor("Java", "Love");
	}
	

}
