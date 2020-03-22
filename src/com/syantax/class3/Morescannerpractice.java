package com.syantax.class3;

import java.util.Scanner;

public class Morescannerpractice {
	public static void main(String[] args){
		Scanner Scan = new Scanner(System.in);
		System.out.println("Is it sunny outside?");
		boolean isSunny=Scan.nextBoolean();
			if (isSunny) {
				    System.out.println("It is a sunny day, I should go somewhere!");
				    System.out.println("What is the temperature outside?");
		  		  int temp=Scan.nextInt();
		  				if (temp>85) {
		  				System.out.println("I am going to the beach!");
		  			}else {
		  				System.out.println("I am going to the park!");
		  			}
				}else {
					System.out.println("I stay home and practice Java!");
				}
		  }
		  
	         
	     
	  }



