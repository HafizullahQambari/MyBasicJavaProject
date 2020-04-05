package com.syntax.class18;

public class USA1 {
	String state, stateCapital;
	
	public USA1(String state, String stateCapital) {
		this.state=state;
		this.stateCapital=stateCapital;
	}
	void display() {
		System.out.println(state);
	}
	void display1() {
		System.out.println(stateCapital);
	}
	void displayAll() {
		display();
		display1();
	}
	public static void main(String[] args) {
		USA1 obj=new USA1("Texas", "Austin");
		
		obj.displayAll();
	}

}
