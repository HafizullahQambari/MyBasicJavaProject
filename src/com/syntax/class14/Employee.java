package com.syntax.class14;

public class Employee {
//	Create a Class called Employee:
//		Create three  variables  eID , salary and set the CEO to “Sumair” 
//		Create two objects of the class Employee 
//		Set the value of eID, salary for each of the objects
//		Print out the eID , salary and  CEO for each of the objects 
		
	int eID;
	int Salary;
	String position;
	public static String CEO="sumair";
	
	
	
	public static void main(String[] args) {
		
		 Employee hafiz=new Employee();
		 hafiz.eID=34563;
		 hafiz.Salary=150000;
		 hafiz.position="Developer";
		 CEO =hafiz.CEO;
		 
		 Employee esmat=new Employee();
		 esmat.eID=34562;
		 esmat.Salary=150000;
		 esmat.position="cybertech";
		 CEO =esmat.CEO;
		 
		 System.out.println("Hafiz is working in Dell company as "+ hafiz.position+ " his Employee ID is "+hafiz.eID+ " and his salary is "+hafiz.Salary);
		 System.out.println("Esmat is working in Deloitte company as "+ esmat.position+ " his Employee ID is "+esmat.eID+" and his salary is "+esmat.Salary);
		 System.out.println(" And thier CEO is " +CEO);
		 
		 
		 
		 
		 
		 
		 
	}

}
