package com.syntax.class11;

public class DarraysTask_1 {

	public static void main(String[] args) {
		// TODO Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		String[] car= {"American", "German", "Korean", "Italian"};
		
		for(int x=0; x<car.length; x++) {
			System.out.print(car[x]);
		}
System.out.println();

   for(String items:car) {
	   System.out.println(items);
	
}
	}

}
