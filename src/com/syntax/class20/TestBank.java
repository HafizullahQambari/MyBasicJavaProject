package com.syntax.class20;

public class TestBank {
	public static void main(String[] args) {
		Bank ba=new Bank(700);
		double fee=ba.chargeFee();
				System.out.println(fee);
		PNC pn=new PNC(700);
		fee= pn.chargeFee();
		System.out.println(fee);
		
		BOA boa=new BOA(700);
		fee=boa.chargeFee();
		System.out.println(fee);
	}

}
