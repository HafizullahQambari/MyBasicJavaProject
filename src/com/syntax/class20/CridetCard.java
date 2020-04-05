package com.syntax.class20;

public class CridetCard {
//	Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance. 
//	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//	Call the method by creating an object of each of the three classes.
	
	double balance;
	double interest;
	CridetCard(double balance){
		this.balance=balance;
	}
	
	double CalcInterest() {
		if(balance<500) {
			interest=balance*0.2;
			
		}
		else {
			balance=0;
		}
		return balance;
	}
}
class Visa extends CridetCard{
	Visa(double balance){
		super(balance);
	}
	
}
class AX extends CridetCard{
	AX(double balance){
		super(balance);
	}
	double CalcInterest() {
		if(balance<700) {
			interest=balance*0.2;
		}
		else {
			balance=0;
		}
		return balance;
	}
}
