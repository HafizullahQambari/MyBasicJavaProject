package com.syntax.class07;

import java.util.Scanner;

public class ClassTask_2 {

	public static void main(String[] args) {
		// Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an “yes” from a user program should stop asking.
			Scanner scan;
			String cridetCard;
			scan=new Scanner(System.in);
			
			System.out.println(" please apply for cridet card");
			cridetCard=scan.nextLine();
			for(int y=1; y<10; y++) {
				
				if(cridetCard.equals("yes")) {
					System.out.println(" congratulations");
					break;
				}
			}
	}

			    
}
