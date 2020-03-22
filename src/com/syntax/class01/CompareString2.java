package com.syntax.class01;

import java.util.Scanner;

public class CompareString2 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println(" Plsease enter your height in inches");
		int height=Scan.nextInt();
		
		if (height<60) {
			System.out.println(" your short");
			
		}else if(height>=60 && height<72) {
			System.out.println(" your medium");
		}else {
			System.out.println(" your tall");
			
		}
			
	System.out.println("Please enter a number");
	int day=Scan.nextInt();
	
	if(day>=1 && day<=5) {
		System.out.println(" it is a weekday");
	}else if(day==6 && day==7) {
		System.out.println(" its weekend");
	}else {
		System.out.println(" invalid day");
	}
	
	}

} 
