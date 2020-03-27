package com.syntax.class14_1;

public class Task_2{
	/*Create a method that will take a String as a parameter and returns reverse String. 
	 * Method should be available to all classes within your projects and accessible by class name.
	 */
	public String task(String word ) {
		
		String rev="";
		
		for(int i=word.length()-1; i>=0; i--){
			
			rev=rev+word.charAt(i);
		}
	return rev;
		
	}
	public static void main(String[] args) {
		
		Task_2 obj=new Task_2();
		String task=obj.task("Yassir");
		System.out.println(task);
	}

}
