package com.syntax.class11;

public class DarrayTask2 {

	public static void main(String[] args) {
		// Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
		// Then print all values from that array using 2 different loops and calculate how many total countries been stored.
		String[][] cars= {
				{"Ford", "Chevrolet","Chrysler","Cadillac"}, 
				{"BMW", "Audi", "Mercedes-Benz", "Porsche"}, 
				{"Hyundai", "Kia", "Daewoo"}, 
				{"Ferrari","Fiat", "Lamborghini", "Maserati" }
				};
		
		for(int x=0; x<cars.length; x++) {
			for(int j=0;j<cars[x].length;j++) {
				
				System.out.print(cars[x][j]+" ");
				
			}
			System.out.println();
			
			
		}
		int sum=0;
		for(String[] count:cars) {
			
			for(String items:count) {
				System.out.println(items+" ");
				sum++;
			}
			System.out.println();
			
		}
		
		
		System.out.println(" total "+sum);
	}

}
