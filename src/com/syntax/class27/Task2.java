package com.syntax.class27;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Task2 {
	public static  List<Exception> exe(){
		List<Exception> exe=new ArrayList<>();
		Iterator<Exception> ex=exe.iterator();
		while(ex.hasNext()) {
			String s=ex.next().getMessage();
			System.out.println(s);
		}
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(Exception ae) {
			exe.add(ae);
			System.out.println(ae.getMessage());
		}
		int[] array= {12, 23, 45};
		try {
			System.out.println(array[5]);
		}catch(Exception ao) {
			exe.add(ao);
			System.out.println(ao);
		}
		String str="hello";
		
		try {
			char ch=str.charAt(8);
		}catch(Exception so) {
			exe.add(so);
			System.out.println(so.getMessage());
		}
		String filePath="";
		try {
			FileInputStream fis=new FileInputStream(filePath);
			
		}catch(Exception fn){
			exe.add(fn);
			fn.printStackTrace();
			System.out.println(fn.getMessage());
		}
		return exe;
	}
	public static void main(String[] args) {
		
		exe();
	}
	

}
