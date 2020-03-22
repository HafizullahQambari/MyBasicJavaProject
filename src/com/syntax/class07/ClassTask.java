package com.syntax.class07;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/*/
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even and odd integers.
		 */
			Scanner scan=new Scanner(System.in);
			int totalEven=0;
			int sumOdds=0;
			System.out.println(" please enter the numbers form 1-20");
			int max=scan.nextInt();
			System.out.println("please enter the number 2");
			int min=scan.nextInt();
			
			for(int y=min; y<=max; y++) {
				
				if(y%2==0) {
					totalEven=totalEven+y;
					
					
				}else {sumOdds=sumOdds+y;}
				System.out.println("total numer of even number between"+max+min+"="+totalEven);
				System.out.println("total numer of odds number between"+max+min+"="+sumOdds);
			}
			System.out.println("===============================");
			/*/
			 * Print numbers from 1 to 50 except those that are divisible by 3
			 * Create a program that will be asking user to apply for a credit card 10 times. 
			 * As soon you get an “yes” from a user program should stop asking
			 * 	
			 */
					
		for(int num=1; num<51; num++) {
			if(num%4!=0) {
				System.out.println("number"+num+  "is not divisible by 4");
				continue;
			}
			System.out.println("number "+num+" divisbile by 4");
		}
	}

}
