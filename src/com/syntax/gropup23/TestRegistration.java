package com.syntax.gropup23;

public class TestRegistration {
	public static void main(String[] args) {
		
		Registration reg=new Registration();
		reg.setEmail("hafiz.kabul@yahoo.com");
		System.out.println(reg.getEmail());
		reg.setUserName("Hafizullah");
		System.out.println(reg.getUserName());
		reg.setPassword("hafiz123");
		System.out.println(reg.getPassword());
	}

}
