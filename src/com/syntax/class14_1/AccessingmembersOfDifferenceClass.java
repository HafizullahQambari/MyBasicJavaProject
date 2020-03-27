package com.syntax.class14_1;


import com.syntax.class14.Employee1;

public class AccessingmembersOfDifferenceClass {
	
public static void main(String[] args) {
		
		Employee1 emp=new Employee1();
		emp.name="Faisal";
		emp.lastName="Sakhi";//protected member
		emp.salary=100000;//default member
		//emp.ssn=78969;CE: field ssn is not visible
		
		Employee1.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); CE: method4 is not visible
		
	}
}
