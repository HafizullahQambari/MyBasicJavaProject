package com.synax.class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
	
	public static void main(String[] args) throws IOException {
		//1. to read the file we need to have file
		
		String filePath="C:\\Users\\baria\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		//2. bring object of fileInputStream
		
		FileInputStream fileInput=new FileInputStream(filePath);
		// to handle data from .properties file we need property class
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String lastName=prop.getProperty("lastName");
		System.out.println(lastName);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
		System.out.println("---------------------------------------------------");
		// getting all keys from property file
		Set<Object> key=prop.keySet();
		for(Object k:key) {
			System.out.println(k);
		}
		Set<Entry<Object, Object>> ob=prop.entrySet();
		for(Entry<Object, Object> obj:ob) {
			System.out.println(obj.getKey()+" : "+obj.getValue());
		}
		
	}

}
