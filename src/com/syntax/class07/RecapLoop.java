package com.syntax.class07;

public class RecapLoop {

	public static void main(String[] args) {
		// write a program to calculate sume of odds and sume of even numbers
		//1 to 99
		int evensum=0;
		int oddsum=0;
		for( int num=1; num<=99; num++) {
			
			if(num%2==0) {
			evensum=evensum+num;
				
			}else {oddsum=oddsum+num;}
		}
		System.out.println(evensum+" "+ oddsum);
		
	}

}
