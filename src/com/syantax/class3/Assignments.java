package com.syantax.class3;

import java.util.Scanner;

public class Assignments {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		String name="";
		System.out.println("please Enter First Name");
		
		name=Scan.nextLine();
		
		String surname="";
		System.out.println(" please Enter Surname");
		
		surname=Scan.nextLine();
		System.out.println(name+" "+surname);
		
		System.out.println("---------------------------");
		Scanner Scan2=new Scanner(System.in);
		String greeting="";
		System.out.println(" Hello, please enter your first name");
		boolean greeting2=Scan2.hasNextLine();
		System.out.println("your Frist name is");
		
		
	}

}
