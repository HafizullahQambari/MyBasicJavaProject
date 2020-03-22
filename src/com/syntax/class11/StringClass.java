package com.syntax.class11;

public class StringClass {

	public static void main(String[] args) {
		// convert String to lower Case and upperCase
		
		String str="hello";
		String word="syntax";
		
		System.out.println(str.toUpperCase());
		System.out.println(word.toLowerCase());
		
		str=str.toLowerCase();
		System.out.println(str);
		
		//concatenate
		String newString=str+word;
		
		String Day="Saturday";
		String date="14";
		String newDate=Day.concat(date);
		System.out.println(newDate);
		System.out.println("===========shows if string is empty===========");
		String str3="dkfdfj";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("==========TRIM Function========");
		
		String str4="             Welcome         ";
		str4=str4.trim();
		System.out.println("String with no leading or tailing spcae "+ str4);
		
		String A="How are you doing";
		String B="how are you doing";
		
		System.out.println(A.equalsIgnoreCase(B));
		
		String expected="how are you doing";
		String actual="How Are You doing";
		
		if(actual.equals(expected)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case not passed");
		}
		if(actual.trim().equals(expected)) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case not passed");
		}
		String browser="Chrome";
		if(browser.equals("chrome")) {
			System.out.println("Test case passed");
		}else{
		System.out.println("Test case not passed");
		}
		

	}

}
