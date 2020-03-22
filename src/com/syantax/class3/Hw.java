package com.syantax.class3;

import java.util.Scanner;

public class Hw {
	
	public static void main(String[] args){
	    Scanner month=new Scanner(System.in);
	    
	    System.out.println(" Please enter the month number 1");
	    int input=month.nextInt();    
	    if(input==1) {
	    	System.out.println(" january");
	    }else if(input==2) {
	    	System.out.println("February");
	    }else if(input==3) {
	    	System.out.println("March");
	    }else if(input==4) {
	    	System.out.println("April");
	    }else if( input==5){
	    	System.out.println("May");
	    }else if(input==6) {
	    	System.out.println("june");
	    }else if(input==7) {
	    	System.out.println("July");
	    }else if(input==8) {
	    	System.out.println("August");
	    }else if(input==9) {
	    	System.out.println("september");
	    }else if(input==10) {
	    	System.out.println("October");
	    }else if(input==11) {
	    	System.out.println("November");
	    }else if(input==12) {
	    	System.out.println("December");
	    }else {
	    	System.out.println("Invaled");
	    }
	}
	

}
