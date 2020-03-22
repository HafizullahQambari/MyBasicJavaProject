package com.syntax.class12;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hight0900-)(**&";
	str=str.replaceAll("[^A-Za-z]", "");
			int number=str.length();
			System.out.println("number of alpha charachter "+number);
			
			String myString="today is Wednsday I have java class";
			
			int str2=myString.length();
			System.out.println(str2);
			String[] array=myString.split(" ");
			int words=array.length;
			
			System.out.println("total word in string "+words);
	
	}

}
