package com.syntax.class14;

public class Students {
//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	String studentName;
	int studentID;
	public static int numberofStudents;
	
	public static void main(String[] args) {
		
		Students st1=new Students();
		st1.studentName="Nazir";
		st1.studentID=45212;
		st1.numberofStudents++;
		
		Students st2=new Students();
		st2.studentName="Mahdy";
		st2.studentID=45124;
		st2.numberofStudents++;
		
		System.out.println("Student 1 is "+st1.studentName+ " his ID is "+st1.studentID);
		System.out.println("Student 2 is "+st2.studentName+ " his ID is "+st2.studentID);
		System.out.println("total number of students "+numberofStudents);	
	}
}
