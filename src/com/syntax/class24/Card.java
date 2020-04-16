package com.syntax.class24;

public abstract class Card {
	/*/
	 * Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type. 
	 *  Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList. 
	 *  Using for loop/advanced for loop/ iterator access all methods of the class.
	 */
	String cridetCardType;
	Card(String cridetCardType){
		this.cridetCardType=cridetCardType;
	}
	
	abstract void apply();
	
	void getCridetCard() {
		System.out.println(cridetCardType+" good for travel tickets");
	}
}
class DebitCard extends Card{
	
	DebitCard(String cridetCardType){
		super(cridetCardType);
	}

	@Override
	void apply() {
		System.out.println("to apply for "+cridetCardType+"you have to open up a bank account");
		
	}
	void getCridetCard() {
		System.out.println(cridetCardType+" is good for grocery purchasing");
}
}
class MasterCard extends Card{
	MasterCard(String cridetCardType){
		super(cridetCardType);
	}
	void apply() {
		System.out.println("to apply for "+cridetCardType+" you have to build good cridet score");
	}
	void getCridetCard() {
		System.out.println(cridetCardType+" good for daily expenses");
}
}
class CitiBank extends Card{
	CitiBank(String cridetCardType){
		super(cridetCardType);
	}
	void apply() {
		System.out.println("to apply for "+cridetCardType+" you have to be a student");
	}
	void getCridetCard() {
		System.out.println(cridetCardType+" good for students");
}
}
