package com.syntax.class18;

public class ThisKeyword {
	int a, b;
	
	ThisKeyword(){
		System.out.println("I am a non arg");
	}
	
	
	public ThisKeyword(int a, int b){
		
		this.a=a;
		this.b=b;
		
	}
	public void sum(int a, int b) {
		System.out.println("sum of local variables "+(a+b));
		System.out.println("Sum of instance variables "+ (this.a+this.b));
	}
	
	public static void main(String[] args) {
	
		ThisKeyword obj=new ThisKeyword(10, 20);
		obj.sum(200, 200);
		ThisKeyword obj2=new ThisKeyword();
		obj2.sum(20, 30);
		
}
}
