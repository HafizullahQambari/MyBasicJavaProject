package com.syntax.class09;

public class nestedLoops_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int x=1; x<i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int z=1; z<10; z++) {
			for(int t=10; t>=z; t--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
