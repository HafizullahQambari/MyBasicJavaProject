package com.syntax.class20;

public class TestCridetCard {
	
	public static void main(String[] args) {
		
		CridetCard cd=new CridetCard(700);
		double interest=cd.CalcInterest();
		System.out.println(interest);
		
		Visa va=new Visa(400);
		interest=va.CalcInterest();
		System.out.println(interest);
		
		AX ax=new AX(700);
		interest=ax.CalcInterest();
		System.out.println(interest);
		
	}

}
