package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		//we want to ask the user name 5 times and print good afternoon.
		Scanner scan;
		int num=1;
		String name;
		scan=new Scanner(System.in);
		while(num<6) {
			System.out.println(" what is your name");
			name=scan.nextLine();
			
			System.out.println("good Afternoon "+name);
			num++;
		}
	}

}
