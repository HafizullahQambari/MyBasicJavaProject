package com.syantax.class3;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		Scanner loan=new Scanner(System.in);
		System.out.println(" what is the amount of loan you need");
		int amount=loan.nextInt();
		System.out.println(amount);
		
		if (amount>200000) {
			System.out.println(" you can buy the house");
		}else {System.out.println(" you can't buy the house");}
		
		
	}

}
