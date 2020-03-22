package com.syntax.class07;

import java.util.Scanner;

public class taskloopAndscanner {

	public static void main(String[] args) {
		int num= 20;
		int luckyNumber = 17;
		Scanner input;
		input=new Scanner(System.in);
		
		
		do{
			System.out.println(" please enter any number between 1-20");
			num=input.nextInt();
			
			
		}while(num!=luckyNumber);
			System.out.println(" congrats your lucky");
			
			
	
		
	}

}
