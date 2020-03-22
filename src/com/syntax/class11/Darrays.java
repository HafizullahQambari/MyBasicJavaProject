package com.syntax.class11;

public class Darrays {
	public static void main(String[] args) {
		String[][] groceries={
                {"cucumber","potato", "carrot"},
                {"mango", "apple", "banana", "kiwi"},
                {"milk", "cheese", "yogurt"}
                };
		for(int x=0; x<groceries.length; x++) {
			
			for(int c=0; c<groceries[x].length; c++) {
				System.out.println(groceries[x][c]+" ");
			}
			System.out.println();
		}
		for(String[]array:groceries) {
			for(String item:array) {
				System.out.print(item+" ");
			}
		}
		System.out.println();
	}

}
