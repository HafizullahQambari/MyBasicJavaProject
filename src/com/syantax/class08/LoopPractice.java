package com.syantax.class08;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		/*/
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount.
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */

		Scanner scan;
		String item;
		double money;
		double price;
		double amount=0;
		double change;
		double remainingBalance;
		scan=new Scanner(System.in);
		System.out.println("please enter the item you want to buy");
		
		item=scan.nextLine();
		System.out.println(" please enter the item price");
		price=scan.nextDouble();
		
		do {
			System.out.println(" please pay money for the item");
			
			money=scan.nextDouble();
			amount=amount+money;
			if(amount<price) {
			remainingBalance=amount-price;
			System.out.println("please pay more");
			
			if(amount>price) {
				change=amount-price;
				System.out.println("Here is your change");
				break;
			}
		}
		}while(price!=amount);
		System.out.println("thanks for your shopping");
	}
		
		
	

}
