package com.syantax.class3;

public class NestedIf {
	public static void main(String[] args) {
		boolean yourEligible=true;
		boolean yourNotEligible=true;
		boolean youCanStillApply=false;
		
		if(yourEligible) {
			System.out.println("your the Right candidate");
			if(youCanStillApply) {
				System.out.println("you can apply for this oppertunity");
				if(yourNotEligible) {
					System.out.println("look for another opertunity");
				}
			}
				else {
				System.out.println("congrats");
			}
		}
		System.out.println("------------------------------------");
		boolean quizCompleted=false;
		int score=46;
		if(quizCompleted) {
		System.out.println("let's check your score");
		if else(score>90) {
			System.out.println(" your the best");
		}if else(score>86){
			System.out.println(" your the man");
		}
		
		}
		
		
	}
	
	
	
	
	

}

	