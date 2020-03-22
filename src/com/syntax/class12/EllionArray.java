package com.syntax.class12;

public class EllionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num= {
				{4, 5, 6, 4, 6, 6},
				{4,8,6,6,4},
				{4,5,4,7,8,}
		};
		int[] sum=new int[num.length];
		for(int j=0; j<num.length; j++) {
			for(int x=0; x<num[j].length; x++) {
				System.out.print(num[j][x]+" ");
			}
		}
	int sum1=0;
		for(int[] row :num) {
			for(int element:row) {
				System.out.println(element+" ");
				sum1+=element;
			}
			System.out.println();
		}
		System.out.println("sume of array "+ sum); 
	}

}
