package com.syntax.class09;

public class nestedLoops {
public static void main(String[] args) {
	for(int i=1; i<=9; i++) {
		for(int y=1; y<=9; y++) {
			System.out.println(i +""+y);
		}
	}
	
	for(int num=0; num<24; num++) {
		
		for(int input=0; input<60; input++) {
			if(num<10) {
				System.out.print("0");
			}else {
				
			}
			
			System.out.println(num+":"+input);
		}
	}
}

}
