package com.syntax.class11;

public class MoreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str="Hello123456#$%^()";
		Str=Str.replaceAll("[A-Za-z]", "");
		System.out.println(Str);
		
		Str=Str.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(Str);
		Str=Str.replaceFirst("H", "C");
		System.out.println(Str);
		
		String Str2="My Name is Khan";
		Str2=Str2.replaceAll(" ", "");
		System.out.println(Str2);

	}

}
