package com.syntax.class10;

public class ArrayTask_2 {

	public static void main(String[] args) {
		// find the largest element in array
		int[] nums= {200, 30,-1, 900, 56, 1000};
		
		int largest=0;
		
		for(int x=0; x<nums.length; x++) {
			
			if(nums[x]>largest) {
				largest=nums[x];
			}
		}
		System.out.println("the largest number is "+ largest);
		int arraySize=nums.length;
		System.out.println("The array Size is "+ arraySize);
		
		
		
		System.out.println("the last element is "+nums[arraySize-1]);
		System.out.println(" The first element is "+nums[arraySize-1]);
		for(int b=0; b<nums.length; b++) {
			System.out.print(" "+nums[b]);
		}
	}
	
	}
			
		
		

	


