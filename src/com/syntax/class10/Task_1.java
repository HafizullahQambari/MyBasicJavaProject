package com.syntax.class10;

public class Task_1 {

	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it.
		//Using 2 different loops print all elements from the array.

		String[] animals= {"dog", "cat", "Birds", "lion", "Donkey", "Monkey"};
		for(String animal:animals) {
			System.out.println(animal);
		}
		System.out.println("===========Second way==================");
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("=======Second task==========");
		//Create an array on integers and calculate the sum of all integer elements in an array.
		int[] numbers= {45, 55, 65, 75, 85, 95};
		int sum=0;
		for(int i:numbers) {
			sum+=1;
		}
		System.out.println(" the sum array is "+ sum);
		
		// Create an array of countries. While retrieving all values from an array print capital for each country. 
		// (use 2 different loops).
		String[] country= {"USA", "Afghanistan", "India", "Pakistan", "Tajikstan"};
		
		for(String countries:country) {
			
			if(countries.equals("Afghanistan")) {
				System.out.println("Kabul");
			} if(countries.equals("USA")) {
				System.out.println("Washington Dc");
			} if(countries.equals("India")) {
				System.out.println("Delhi");
			} if(countries.equals("Pakistan")) {
				System.out.println("Islam Abad");
			}if(countries.equals("Tajikstan")) {
				System.out.println("Dushanbee");
			}
			
			
		}
		
		
		
		
	}

}
