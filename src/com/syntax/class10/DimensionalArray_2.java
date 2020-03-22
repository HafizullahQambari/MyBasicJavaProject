package com.syntax.class10;

public class DimensionalArray_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] months= {
				{"January", "February", "March"},
				{"April", "May", "June"},
				{"July", "August", "September"},
				{"October", "November", "December"}
		};
		int rows=months.length;
		int firstArray=months[1].length;
		System.out.println(firstArray);
		
		for (int i=0; i<months.length; i++) {
			for (int j=0; j<months[i].length; j++){
				
				System.out.println(months[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
