package com.syntax.class07;

public class onlineWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sumEven=0;
		double sumOdds=0;
		int num=1;
		while(num<=50) {
			
			if(num%2==0) {
				
				sumEven+=num;
			}else {
				sumOdds+=num;
			}
			num++;
			System.out.println(" the total of even is = "+sumEven);
			System.out.println(" the total of odd is ="+sumOdds);
		}
		for (int i=0; i<50; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdds+=i;
			}
			System.out.println(" the total of even is = "+sumEven);
			System.out.println(" the total of odd is ="+sumOdds);
		}
		for (int age=1; age<20; age++) {
			if(age==13) {
			
		}
			System.out.println("Happy Birthday your "+age+" years old");
			continue;
			}
		
	}
	

}
