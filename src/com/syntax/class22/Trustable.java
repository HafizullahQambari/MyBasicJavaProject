package com.syntax.class22;

public interface Trustable {
	void trust();
	

}
interface Bank extends Trustable {
	
	void deposit();
	
	void withdraw();
}
class BOA extends Finance implements Bank, CridetUnion{

	@Override
	public void trust() {
		System.out.println("Bank of America is trustable");
		
	}

	@Override
	public void deposit() {
		System.out.println("you can add money to the BoA");
		
	}

	@Override
	public void withdraw() {
		System.out.println("you can withdraw money form BoA");
		
	}

	@Override
	public void giveCridet() {
		System.out.println("BoA can give cridet");
		
	}
	
}
interface CridetUnion{
	void giveCridet();
}
class Finance{
	public void financing() {
		System.out.println("finance deals with financing");
	}
}
