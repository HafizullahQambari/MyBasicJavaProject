package com.syntax.class11;

import java.util.Scanner;

public class String02Task {

	public static void main(String[] args) {
		// Write a program that reads two people’s first names and if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
			// Example Output:
			// Mom’s first name? Mary
			// Dad’s first name? Daniel
			// Boy or Girl? boy
			// Suggested baby name: DANRY
		String MomName;
		String DadName;	
		boolean boy = true;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter Mom' name");
		MomName=scan.nextLine();
		System.out.println("please enter Dad' name");
		DadName=scan.nextLine();
		if (!boy) {
			System.out.println(MomName.substring(0,3)+DadName.substring(3));
		}else {
			System.out.println(DadName.substring(0,3)+MomName.substring(3));
		}
	}

}
