package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour=25;
		String timeofDay;
		if(hour>=1 && hour<=11) {
			timeofDay="Morning";
		}else if(hour>=12 && hour<=15) {
			timeofDay="Afternoon";
		}else if (hour>=16 && hour<=20) {
			timeofDay="Evening";
		}else if(hour>=21 && hour<=24) {
			timeofDay="night";
		}else {
			timeofDay="unknown";
		}
			if(!timeofDay.equals("unknown")) {
				System.out.println(" Right now is "+ timeofDay);
			}

	}

}
