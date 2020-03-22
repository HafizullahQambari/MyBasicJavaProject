package com.syntax.class10;

public class DArrayHW_2 {

	public static void main(String[] args) {
		// Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then you program should print name of the students that has A and B grade
		String[][] names= {
				{"Mehar", "Sophia", "Yasir", "Omran"},
				{"A", "B", "C", "D", "E", "F"},
		};

		System.out.println(names[0][0]+" "+ names[1][0]);
		System.out.println(names[0][1]+" "+names[1][1]);
		System.out.println(names[0][2]+" "+names[1][2]);
		System.out.println(names[0][3]+" "+names[1][3]);
		
	}
	

}
