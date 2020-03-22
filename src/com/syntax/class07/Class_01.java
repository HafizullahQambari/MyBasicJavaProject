package com.syntax.class07;

public class Class_01 {

	public static void main(String[] args) {
		int time=10;
		if(time>12) {
			System.out.println("good morning");
		}
while(time<12) {
	System.out.println("good morning");
	time++;
}
// how to print numbers from 1-50?
int smile=50;
while(smile>=1) {
	System.out.println(smile);
	smile--;
	
}// how to print number 20-30?
 int sofia=20;
 while(sofia<=30) {

	 if(sofia%2!=0) {
		 System.out.println(sofia);
		 sofia++;
	 }
 }
 

System.out.println("========================");
// how to print 50-1?
int num3=50;
while(num3>=1) {
	System.out.print(num3+" ");
	num3--;
}

System.out.println(" how to print odds numbers from 1 to 20");
int limit = 1;

System.out.println("Printing Odd numbers between 20 and " + limit);
while(limit<20) {
	System.out.println(limit++);
	limit++;

}





	}

}
