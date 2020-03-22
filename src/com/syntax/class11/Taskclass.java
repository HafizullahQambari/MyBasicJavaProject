package com.syntax.class11;

public class Taskclass {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		String sen="How are you doing today Asel";
		sen=sen.replaceAll(" ", "");
		System.out.println(sen);
		
		String hi="ahmad won 23 bonuse and got $3400";
		
		hi=hi.replaceAll("[^a-z]", "");
		
			System.out.println(hi.length());
		
	
		String str1="Is it saturday? Is it raining? Do we have Java class today?";
		String[] str2=str1.split(" ");
		System.out.println(str2.length);
		
		
		
		

	}

}
