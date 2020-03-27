package com.syntax.class14_1;

public class Arrayofpara {
//	Create a method that will accept an array as parameters and will return a sum of all elements from that array.
//			Method should be visibly only within same package and accessible by the creating 
//			an instance of the class.
	
	 int array(int[] x) {
		
		int sum=0;
		
		for(int i=0; i<x.length; i++) {
			
			sum=sum+x[i];
			
		}
		return sum;
		
		 
	 }
	public static void main(String[] args) {
		
		Arrayofpara obj=new Arrayofpara();
		int [] array= {45, 56, 34, 98};
		 int arr=obj.array(array);
		 System.out.println(arr);
		
	}
}
