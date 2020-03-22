package com.syntax.class06;

import java.util.Scanner;

public class HomeWork {

	
		 /*/
		  *Allow user to enter grade and then provide
explanation: A-Excellent, B-Good, C-Average,
D-Bad, any other grade --> Not Acceptable. At the
end your program should print which grade was
entered by a user with explanation

		  */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" please enter your grade");
		 String grade=scan.nextLine();
		 
		 switch (grade){
		 
		 case "A":
			 grade="Excellent";
			 break;
		 case "B":
			 grade="Good";
		 case "C":
			 grade="Average";
			 break;
		 case "D":
			 grade="Bad";
			 break;
			 default:
				 grade="Not Acceptable";
			 
		 }
		 System.out.println(grade);
	}
	
		 }

