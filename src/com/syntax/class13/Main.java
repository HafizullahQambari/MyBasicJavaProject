package com.syntax.class13;

class Main {
	static int a;
	
	public int num(){
		a++;
	}
	public void counter() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Main obj1=new Main();
		Main obj2=new Main();
		Main obj3=new Main();
		obj1.counter();
	}
}
	