package com.syntax.class13;

public class Computer {
	
	String name="";
	String Model="";
	
	
	
	void play(){
		System.out.println("My");
	}
	void showPic(){
		System.out.println("my computer is " +name);
	}void learn(){
		System.out.println("it teach you Java");
	}
	public static void main(String[] args) {
		Computer comp=new Computer();
		comp.name="Hp";
		comp.Model="Nitro";
		
		
		comp.showPic();
		comp.learn();
			
		System.out.println("I like "+comp.name);
		System.out.println(" it has"+comp.Model+" feature");
		
	}
	
	
	
	

}
