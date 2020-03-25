package com.syntax.class09;

import java.util.Scanner;

public class Arrays_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a string ");
		
		String num=scan.nextLine();
		
char[]	hi=num.toCharArray();
	String rev="";
 	for(int i=num.length()-1; i>=0; i--) {
 		
 		rev+=hi[i];
 		
 		
 	}if(hi.equals(num)) {
 		System.out.println(num+" is palindrom");
 	}
 	else {
 		System.out.println(num+ " is not palindrom");
 	}
 	
		
	}

}
