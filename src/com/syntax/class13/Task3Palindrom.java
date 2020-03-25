package com.syntax.class13;

public class Task3Palindrom {
	//Create a method that will print whether given String is palindrome or not.
	
	void pal(String word) {
		String rev="";
		char[] array=word.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			rev=rev+array[i];
		}
		if(rev.equalsIgnoreCase()) {
			System.out.println(word+" is palindrom");
		}else {
			System.out.println(word+" is not palindrom");
		}
		
	}
	public static void main(String[] args) {
		 Task3Palindrom task3=new Task3Palindrom();
		 task3.pal("never odd or even");
	}

}
