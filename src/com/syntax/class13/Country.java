package com.syntax.class13;

public class Country {
	//Create a method that will say Hello in different language based on the country that will passed when method is executed. 
	String language;
	
	void lang(String country) {
		
		System.out.println(language);
		
		switch(country.toLowerCase()){
			
			case "afghanistan":
				language="salam";
				break;
			case "usa":
				language="Hello";
				break;
			case "iran":
				language="Khasta nabashen";
				break;
			case "kapisa":
				language="Manda nashi";
				break;
				default:
					language="worng country";
			
			
		}
			
		}
		public static void main(String[] args) {
			Country obj=new Country();
			obj.lang("afghanistan");
		}
		
	}
	

