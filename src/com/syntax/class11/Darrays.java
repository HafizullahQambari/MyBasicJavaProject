package com.syntax.class11;

import java.util.Scanner;;

public class Darrays {
    public String num(String Fname, String Lname, String emailtype) {
    	//Create a method createEmail(). Based on provided users name, lastName and email type,
    	// your method should return complete email Address. Example: 
        
        String h= Fname+Lname+emailtype;
        return h;
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Pleas enter your first name");
        String Fname=scan.nextLine();
        
        System.out.println("Pleas enter your last name");
        String Lname=scan.nextLine();
        
        System.out.println("Pleas enter your email type: @gmail.com || @yahoo.com ");
        String emailtype=scan.nextLine();
                
        Darrays obj=new Darrays();
        String x=obj.num(Fname,Lname,emailtype);
        System.out.println(x);
        
        
    }}
    

