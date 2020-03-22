package com.syntax.class06;

import java.util.Scanner;

public class Switchcase_2 {
	
	public static void main(String[] args){
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter name of the instructor");
	  String  instructor=scan.nextLine();
	  String assigned;

	    switch (instructor){
	      case"Shiva":
	        assigned= "Java";
	        break;
	        case "Sandish":
	          assigned="SDLC";
	          break;
	        case"Weqas":
	          assigned="Selenium";
	          break;
	        case "Asel":
	          assigned= "every";
	          break;
	          default:
	          assigned=" invalid instructor selected";
	          
	          
	    }  
	    
	    
	    System.out.println("Will take care of"+assigned+" Assignment"); }
	
}
