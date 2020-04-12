package com.syntax.gropup23;
import java.util.ArrayList;
public class	Task{
//	/*/Create a generic ArrayList that will store 5 names into it. 
//	Find out whether the given ArrayList is empty or not? 
//	Check whether the specific name is present in an ArrayList or not?
//	Find the size of your arrayList and print all values from that
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("Mahady");
		names.add("Saif");
		names.add("Evlyen");
		names.add("hafiz");
		names.add("Ahmad");
		
		int size=names.size();
		System.out.println("the arrays size is "+size);//size of the array
		
		boolean speceficName=names.contains("Saif");
		System.out.println("is saif exist in the array "+speceficName);//specefic name in the array
		
		boolean empty=names.isEmpty();// is array is empty?
		System.out.println("is arrayList is empty "+empty);
		
		System.out.println("============finding specefic name by index============");
		
			String num=names.get(3);
			System.out.println("the specefic name is "+num);
		System.out.println("=========using enhanced loop printing all elements of array========");
		
		for(String task:names) {
			
			System.out.print(task+" ");
		}
	}

}
