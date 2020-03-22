package com.syntax.class06;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		String country;
		Scanner scan;
		String language;
		scan=new Scanner(System.in);
		System.out.println(" Plesae enter your country name");
		country=scan.nextLine();
		
		switch (country) {
		case "Afghanistan":
		language="Persian";
		break;
		
		case "Iran":
			language="Farsi";
			break;
		case "pakistan":
			language="Urdu";
		break;
		case"china":
			language="chiness";
			break;
		default:
			language="unknown";
			
		
		}
		System.out.println(" your spoken language is "+language);
		

	}

}
