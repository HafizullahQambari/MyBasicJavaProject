package com.syntax.gropuHW;

public class SyntaxStudentException extends Exception {
	
	public SyntaxStudentException(String message) {
		super(message);
	}

	public static void gradeCheck(int grade) {
		if(grade>90) {
			System.out.println(new SyntaxStudentException("your an exceptionally awesome student"));
		}else if(grade<90) {
			System.out.println(new SyntaxStudentException("your a great student"));
		}
	}
	public static void main(String[] args) {
		
		gradeCheck(93);
	}

}
