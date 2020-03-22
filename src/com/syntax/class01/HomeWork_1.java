package com.syntax.class01;

import java.util.Scanner;

public class HomeWork_1 {

	public static void main(String[] args) {
		/*/Write a program to find largest of three double values using
		 *  if-else..if and logical operators provided by a user (numbers must be distinct)
		 * 
		 */
		double num1;
		double num2;
		double num3;
		double result;
		result=0;
		Scanner input=new Scanner(System.in);
		System.out.println(" Please enter the first value");
		num1=input.nextDouble();
		
		System.out.println(" Please enter the second value");
		num2=input.nextDouble();
		
		System.out.println("Please enter the third number");
		num3=input.nextDouble();
		
		if(num1>num2 && num1>num3) {
			
			result=num1;}
		else if(num2>num1 && num2>num3) {
			result=num2;
		} else if(num3>num1 && num3>num2) {
			result=num3;
		}else {
			System.out.println(" the numbers are not distinct");
		}
			System.out.println(" the large number is "+result);
		}
			
			
	}


