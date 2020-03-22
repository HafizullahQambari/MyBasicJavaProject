package com.syntax.class13;

public class Method {
	//Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void num(int a, int b) {
		if(a>b) {
			System.out.println(a+" is the larger");
		}else if(b>a) {
			System.out.println(b+" is the larger");
		}
	}
	public static void main(String[] args) {
		Method par=new Method();
		par.num(13, 15);
	}

}
