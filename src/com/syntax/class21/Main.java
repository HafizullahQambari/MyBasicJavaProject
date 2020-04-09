package com.syntax.class21;

class Main {
	  
	public static final double avgElements(int[] num) {
		
		double sum=0;
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
			double result=sum/num.length;
			return result;
			
		}
		public static void main(String[] args) {
			int[] a = {2,7,3,8,4};
			System.out.println(avgElements(a)); //should print 4.8
		}
	}