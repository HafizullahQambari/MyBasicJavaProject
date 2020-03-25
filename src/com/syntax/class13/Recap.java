package com.syntax.class13;

public class Recap {
	
	//create method that will accept aray of integers and return max
	
	int getLargestNumber(int[] array) {
		int largest=array[0];
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>largest) {
				largest=array[i];
				
			}
		}
		return largest;
		
		
	}
	
	String[] getWordsFromString(String str) {
		String[] array=str.split(" ");
		
		
		return array;
	}
	public static void main(String[] args) {
		
		Recap obj=new Recap();
		
		int [] arr= {10, 20, 38, 12};
		System.out.println(obj.getLargestNumber(arr));
		
		String myString="its a good day";
		String[] word=obj.getWordsFromString(myString);
		
		for(String hi:word) {
			System.out.print(hi+" ");
		}
		
		
		
		
	}
}
