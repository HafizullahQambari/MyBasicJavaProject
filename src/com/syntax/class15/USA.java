package com.syntax.class15;

public class USA {
	// create variables to hold state and capital of the state
	String state, capital;
	 
	public void display() {
		System.out.println(state+" and its capital is "+ capital);
	}
	public USA(String state, String capital) {
		this.state=state;
		this.capital=capital;
		
		
		
	}
	public static void main(String[] args) {
		USA obj=new USA("virginia", "Richmond");
		obj.display();
	}

}
