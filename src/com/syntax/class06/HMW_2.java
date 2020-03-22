package com.syntax.class06;

import java.util.Scanner;

public class HMW_2 {

	public static void main(String[] args) {
		// Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.
		int num1;
		int num2;
		String operator;
		operator=null;
		int result;
		result=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the first number");
		num1=scan.nextInt();
		
		System.out.println(" please enter an operator");
		operator=scan.next();
		
		System.out.println("please enter the second number");
		num2=scan.nextInt();
		
		switch (operator){
			case "+":
				result= num1+num2;
				break;
			case "-":
				result= num1-num2;
				break;
			case "*":
				result=num1*num2;
				break;
			case "/":
				result=num1/num2;
				break;
				default:
					System.out.println("you entered a wrong operator");	
					return;
		}
		
		System.out.println(" The result is:\n"+ num1+operator+num2+"="+result);
	}
}
