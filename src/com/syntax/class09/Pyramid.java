package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int r=7; r>=1; r--) {
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
			System.out.println();
	}
		for(int z=1; z<5; z++) {
			for(int x=0; x<=z; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int t=5; t>=1; t--) {
			for(int d=1; d<=t; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
