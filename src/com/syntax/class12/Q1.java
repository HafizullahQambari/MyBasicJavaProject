package com.syntax.class12;

public class Q1 {

	public static void main(String[] args) {
		// TODO swap 2 value of integers 

		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		String str1="Day";
		String str2="Nigth";
		
		str1=str1.concat(str2);
		str2=str1.substring(0, 3);
		str1=str1.substring(3);
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
