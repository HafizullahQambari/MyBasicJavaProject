package com.syntax.class10;

public class TwoDimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers=new int[3][4];
		//1 row
		numbers[0][0]=10;
		numbers[0][1]=10;
		numbers[0][2]=10;
		numbers[0][3]=10;
		//2 rows
		numbers[1][0]=55;
		numbers[1][1]=45;
		numbers[1][2]=45;
		numbers[1][3]=55;
		// 3 row
		numbers[2][0]=45;
		numbers[2][1]=44;
		numbers[2][2]=55;
		numbers[2][3]=66;
		System.out.println(numbers[2][0]);
		int[][] nums= {
				{20, 50, 51, 52,},
				{52, 54, 48, 65},
				{1, 2, 3, 4},
				};
		System.out.println(nums[0][1]);
	}

}
