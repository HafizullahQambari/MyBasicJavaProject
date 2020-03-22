package com.syantax.class08;

import java.util.Scanner;

public class LoopOnline_3 {
	// find the total of even and odd numbers between 1-50.
	public static void main(String[] args) {
		int totalEven=0;
		int totalOdds=0;
		for(int num=1; num<50; num++) {
			if(num%2==0) {
				totalEven=totalEven+num;
			}else {
				totalOdds=totalOdds+num;
			}
		}
		System.out.println(totalEven+totalOdds);
}
}