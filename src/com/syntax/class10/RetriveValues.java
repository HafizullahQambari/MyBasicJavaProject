package com.syntax.class10;

public class RetriveValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		for(int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
		}
		System.out.println();
		System.out.println("================= printing all elelments using advanced for loop =============");
		for( char grade:grades) {
			System.out.println(grade+" ");
			// creat an array of fruits and retrive all elements
			String [] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
			//advanced for loop, enhanced loop, for each loop
			for (String fruit:fruits) {
				System.out.println(fruit);
			}
			System.out.println("=======================");
			// regular for loop
			//fruits.lenght =number of elements
			for(int i=0; i<fruits.length; i++) {
				
				System.out.println(fruits[i]);
			}
		}
	}

}
