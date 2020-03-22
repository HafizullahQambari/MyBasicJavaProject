package com.syntax.class07;

public class loopHW_2 {
	public static void main(String[] args) {
		// print even numbers from 20-1 first way
		int num=20;
				while(num>1) {
					System.out.println(num);
					num--;
					num--;
				}
				// 
				for(int z=20; z<50; z++) {
		            if(z%2!=0) {
		            	System.out.println(z);
		            }
		        }
for(int x=50; x<70; x++) {
	System.out.println();
}
		for(int b=100; b>25; b-=2) {
			System.out.println(b-1);
		}
	}

}
