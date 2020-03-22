package com.syntax.class09;

public class Arrays_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		System.out.println(array[1]);
		// declaring String
		String[] carArray;
		carArray=new String[4];
		carArray[0]="BMW";
		carArray[1]="Toyota";
		carArray[2]="cheveorlet";
		carArray[3]="Honda";
		System.out.println("I am driving "+carArray[2]);
		////////////////
		int[] numbers=new int[4];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		numbers[3]=400;
		numbers[0]=900;
		System.out.println(numbers[0]+numbers[2]);
		
	}

}
