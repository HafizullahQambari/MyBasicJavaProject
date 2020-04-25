package com.synax.class26;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class WriteIntoExistingFile {
	public static void main(String[] args) throws IOException {
		
		
		
		String filePath="C:\\Users\\baria\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		
		FileInputStream file=new FileInputStream(filePath);
		Properties prop=new Properties();
		//prop.load(file);
		
		prop.setProperty("phoneNumber", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos, "added aditional key");
	
	}

}
