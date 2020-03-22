package com.syantax.class3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*/
		 * For you to do:
			Write a program to take user name, age and mobile number

			First Output: "Enter your name"
			Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
				Third Output: "Enter your age" 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		
		System.out.println("Enter your mobile number");
		int phoneNumber=scan.nextInt();
		
		System.out.println("Etner your age");
		int age=scan.nextInt();
		
		System.out.println("your name is "+name+" your mobile number is "+phoneNumber+" your age is "+age);
		
		
		
		

	}

}
