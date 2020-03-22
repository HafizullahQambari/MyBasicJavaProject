package com.syntax.class09;

public class NestedLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=0; num<10; num++) {
			for(int y=0; y<10; y++) {
				for(int x=0; x<10; x++) {
					for(int z=0; z<10; z++) {
						System.out.println(num+""+y+""+x+""+z);
					}
					
				}
			}
		}
	}

}
