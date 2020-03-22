package com.syntax.class12;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hi="I love Java";
		String reversed="";
		
		for(int i=hi.length()-1; i>0; i--) {
			
			reversed=reversed+hi.charAt(i);
		}
		System.out.println(reversed);
		String reversewords="";
		
		String[] hi1=hi.split(" " );
		
		for( int i=hi1.length-1; i>=0; i--) {
			reversewords=reversewords+hi1[i];
			
		}
		System.out.println(reversewords);
	}

}
