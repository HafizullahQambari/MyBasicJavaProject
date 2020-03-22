package com.syntax.class06;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/*/
		 * write a program to ask user if there is a sale
		 * if no sale==> not going shopping
		 * if sale we will ask the price of the item
		 * based on the price we will apply discount and calculate final price.
		 * 
		 * if price less than 20==> apply 10%
		 * if price between than 20 and 100==> 20%
		 * if price between  100 and 500==> apply 30%
		 * if price more than 500--> apply 50%
		 * 
		 * After discount ___ the price of the item reduced from___ to ___
		 * 
		 */
		Scanner scan;
		String sale = null;
		double price = 0.0;
		double discount=0.0;
		double finalPrice=0.0;
		Scanner Scan=new Scanner(System.in);
		System.out.println( "did you purchase anything today");
		sale=Scan.nextLine();
		if(sale.contentEquals("yes")) {
			System.out.println(" enter the price before discount");
		}else {
			System.out.println(" no shoping today");
		}
		price=Scan.nextDouble();
		
		
		if(price<20) {
			discount=price*0.10;
			
		}else if(price>20 && price<100) {
			discount=price*0.20;
			
		}else if(price>100 && price<500) {
			discount=price*0.30;
			
		}else if(price<500) {
			discount=price*0.50;
			
		}
		finalPrice=price-discount;
		System.out.println(" After "+discount+ " discount the price of the item reduced form " +price+" to "+finalPrice);
		
		
	}

}
