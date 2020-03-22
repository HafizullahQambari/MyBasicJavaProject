package com.syntax.class12;

public class Q2Fibonaci {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		    int a, b, c;
		    
		    a=0;
		    b=1;
		    for(int i=0; i<10; i++) {
		    	System.out.print(" "+a);
		    	
		    	c=a+b;
		    	a=b;
		    	b=c;
		    }
		        
		    }

}
