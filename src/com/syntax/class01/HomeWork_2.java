package com.syntax.class01;

import java.util.Scanner;

public class HomeWork_2 {

	public static void main(String[] args) {
		/*/
		 * Write a program that will read three inputs of scores 
		 * (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
		 */
		Scanner Scan=new Scanner(System.in);
		
	System.out.println("please enter your quiz score");
	String grade=null;	
	int quiz=Scan.nextInt();
	System.out.println(" Please enter your mid term score");
	
	int midterm=Scan.nextInt();
	System.out.println(" Please enter your final score");
	
	int finalScore=Scan.nextInt();
	
	double all=quiz+midterm+finalScore;
	
	if((all/3)>=90) 
		grade="A";
	else if((all/3)>=70 && (all/3)<90)
	grade="B";
	else if((all/3)>=50 && (all/3)<70)
	grade="c";
	else if((all/3)<50)
	grade="F";
	System.out.println("your grade is "+grade);
	
	}

}
