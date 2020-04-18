package com.syntax.gropuHW;

public class TestRepl {
	public static void main(String[] args) {
		Practice p=new Practice();
		p.setFirstName("John");
		p.setlastName("Doe");
		p.setbirthMonth(10);
		p.setbirthday(25);
		p.setbirthyear(1990);
		p.setssn("123-45-6789");
		
		System.out.println(p.getFirstName());
		System.out.println(p.getlastName());
		
		
		System.out.println(p.formatBirthday());
		System.out.println(p.getssn());
	}
	
	
	

}
