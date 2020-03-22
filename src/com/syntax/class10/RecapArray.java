package com.syntax.class10;

public class RecapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grades=new int[5];
		grades[0]=93;
		grades[1]=81;
		grades[2]=65;
		grades[3]=72;
		grades[4]=80;
		int average= (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/2;
		System.out.println("the average is"+ average);
		
		String[] cities= {"whashington DC", "New York", "Paris", "Miami","Los Angles", "Chantily",};
		// I live in paris
		System.out.println(" I live in "+cities[2]);
		int x=1;
		System.out.println(cities[x]);
		x+=3; 
		System.out.println("I moved to"+ cities[x]);
		// how many elements stored inside an array?
		int arraySize= cities.length;
		System.out.println("total elements "+arraySize);
		// how can we access the last element
		System.out.println(cities[arraySize-1]);
		// access all elements
		for(int i=0; i<arraySize; i++) {
			System.out.println((arraySize[i]));
		}
		
	}
	

}
