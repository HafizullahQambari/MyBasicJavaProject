package com.syntax.class09;

public class ArrayHW_3 {

	public static void main(String[] args) {
		//Create an array of words: Java, Saturday, day, coding, is.
		// Print the following sentence using elements of array: “Saturday is Java coding Day”.
		String[] GroupofWords=new String[5];
		
		
		GroupofWords[0]="Saturday";
		GroupofWords[1]="is";
		GroupofWords[2]="java";
		GroupofWords[3]="coding";
		GroupofWords[4]="Day";
		System.out.println(GroupofWords[0]+" "+GroupofWords[1]+" "+GroupofWords[2]+" "+GroupofWords[3]+" "+GroupofWords[4]);
		
		String[] names= {"java", "Saturday", "day", "coding", "is"};
		for(String name:names) {
			System.out.print(name);
			
		}
		
	}
	

}
