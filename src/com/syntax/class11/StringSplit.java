package com.syntax.class11;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Today="Today is my favourite Java class";
		String[] Today1=Today.split("my");
		
		System.out.println(Today.length());
		
		System.out.println(Today1[0]);
		System.out.println(Today1[1]);
		String[] Hi=Today.split("a");
		
		for(String array:Today1) {
			System.out.println(array);
		}
		String today3="Today is my favourite java class";
		String[] word=today3.split(" ");
		
		for(String arr:word) {
			System.out.print(arr);
			
		}
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]);
		}
	}

}
