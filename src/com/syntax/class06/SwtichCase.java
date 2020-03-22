package com.syntax.class06;

import java.util.Scanner;

public class SwtichCase {

	public static void main(String[] args) {
		int day=5;
		String dayName;
		Scanner Scan=new Scanner(System.in);
		System.out.println("plese enter a number");
		int enter=Scan.nextInt();
		
		
		if(day==1) {
			dayName="Monday";
		}else if(day==2) {
			dayName="tuesday";
		}else if(day==3) {
			dayName="Wednsday";
		}else if(day==4) {
			dayName="thursday";
		}else if(day==5) {
			dayName="Friday";
		}else if(day==6) {
			dayName="Saturday";
		}else if(day==7) {
			dayName="Sunday";
		}else {
			dayName="Invalid entery";
		}
		System.out.println("its "+ dayName);	
		System.out.println("----------------------------------------");
		String today;
		switch (day) {
		case 1:
			today="monday";
			break;
		case 2:
			today="tuesday";
			break;
		case 3:
			today="wednsday";
			break;
		case 4:
			today="thursday";
			break;
		case 5:
		today="friday";
		break;
		case 6:
			today="saturday";
		break;
		case 7:
			today="sunday";
			break;
		default:
			today=" invalid entery";
			
			
		}
	}
	

}
