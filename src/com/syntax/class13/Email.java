package com.syntax.class13;

import java.util.Scanner;

public class Email {

//	Create a method createEmail(). Based on provided users name, lastName and email type, 
//	your method should return complete email Address. Example: 
	
	public String num(String fname, String Lname, String Address){
	String h= fname+Lname+Address;
	return h;
	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your first name");
		String fname=scan.nextLine();
		System.out.println("Please enter your last name");
		String Lname=scan.nextLine();
		System.out.println("Please enter your email type @gmail.com || @yahoo.com ");
		String Address=scan.nextLine();
		
		
		Email obj=new Email();
		String email=obj.num(fname, Lname, Address);
		System.out.println(email);
		
		
		
	}
}
