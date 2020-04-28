package com.synax.class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Task {
	public static void main(String[] args) throws IOException {
		
	String filePath="C:\\Users\\baria\\eclipse-workspace\\JavaBasics\\configs\\Browser.properties";
	
	FileInputStream input=new FileInputStream(filePath);
	
	Properties prop=new Properties();
	prop.load(input);
	
	Object browse=prop.getProperty("browser");
	System.out.println(browse);
	Object ur=prop.getProperty("url");
	System.out.println(ur);
	System.out.println("-------------------------");
	Set<Entry<Object, Object>> ob=prop.entrySet();
	
	for(Entry<Object, Object> item:ob) {
		System.out.println (item.getKey()+":"+item.getValue());
	}

}
}