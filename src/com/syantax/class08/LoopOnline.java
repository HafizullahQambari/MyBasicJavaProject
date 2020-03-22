package com.syantax.class08;

public class LoopOnline {

	public static void main(String[] args) {

		for(int num=15; num<35; num++) {
			if(num%2==0 && num%3==0) {
				continue;
			}
			System.out.println(num);
		}
		for(int y=15; y<35; y++) {
			if(y%2==0) {
				continue;
		}
			System.out.println(y);
		}
		
	}

}
