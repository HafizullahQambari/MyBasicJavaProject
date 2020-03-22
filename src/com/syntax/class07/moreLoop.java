package com.syntax.class07;

public class moreLoop {
	public static void main(String[] args) {
		int num=4;
		for(int i=1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+i*num);
	}
		
		System.out.println("-----------------------");
		
		// wrtie a program that print numbers from 1-20
		// i dont want to print 6,6,7
		
	
		for(int y=1; y<=20; y++) {
			if(y>=4 && y<=8) {
				continue;
			}
			
			System.out.println(y);
		}
			
	}
	

}
