package com.syntax.class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\baria\\eclipse-workspace\\JavaBasics\\TestData\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		Sheet sheet=wbook.getSheet("Sheet1");
		Row row1=sheet.getRow(0);
		Cell cell=row1.getCell(1);
		// get value form cell
		String r1cell2=cell.toString();
		System.out.println(r1cell2);
		//access new york
		Row row2=sheet.getRow(2);
		Cell cell2=row2.getCell(2);
		String n=cell2.toString();
		System.out.println(n);
		// access Virginia
		
	String	cellValue=sheet.getRow(1).getCell(3).toString();
	System.out.println(cellValue);
	
	double cellV=sheet.getRow(1).getCell(4).getNumericCellValue();
	System.out.println((int)cellV);
	
	String cell1=sheet.getRow(1).getCell(4).toString();
	System.out.println(cell1);
	String [] arr=cell1.split("\\.");
	System.out.println(arr[0]);
		
		
		
	}

}
