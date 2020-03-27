package com.syntax.class14_1;

public class Vowels {
/*/
 * Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
 * Method should be available inside the class where it was declared and executed by calling it is name.
 */
	private String vowel(String word) {
		word=word.replaceAll("[a-zA-Z &&[^aeiouAEIOU]]" , "");
		
		return word;
		
	}
	public static void main(String[] args) {
		
		Vowels obj=new Vowels();
		String word1=obj.vowel("coronovirus");
		System.out.println(word1);
	}
	
}
