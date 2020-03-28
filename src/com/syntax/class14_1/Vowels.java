package com.syntax.class14_1;

public class Vowels {
/*/
 * Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
 * Method should be available inside the class where it was declared and executed by calling it is name.
 */
	public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args){
		System.out.println(count_Vowels("obama")); //3
		System.out.println(count_Vowels("happy friday! i love weekends")); //9
	}
}
