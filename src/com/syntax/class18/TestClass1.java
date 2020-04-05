package com.syntax.class18;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		obj.empNumber=12345;
		obj.salary=11000.00;
		obj.work("Syntax");
		obj.getPaid();
		
		ScrumTeam obj1=new ScrumTeam();
		obj1.ceremonies="Standup meeting";
		obj1.empNumber=23254;
		obj1.salary=12000.00;
		obj1.getPaid();
		obj1.work("cybertek");
		obj1.attendMeetings();
		Tester obj2=new Tester();
		obj2.test();

	}

}
