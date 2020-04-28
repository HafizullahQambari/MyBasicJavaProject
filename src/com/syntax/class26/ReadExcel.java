package com.syntax.class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\baria\\Desktop\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
	Sheet sheet=wbook.getSheet("sheet1");
	//to find the number of rows
	int rows=sheet.getPhysicalNumberOfRows();
	int cols=sheet.getRow(0).getLastCellNum();
	// get data from all rows and all columns
	
	for(int r=0; r<rows; r++) {
		for(int c=0; c<cols; c++) {
			
			String cellV=sheet.getRow(r).getCell(c).toString();
			System.out.print(cellV+" ");
		}
		System.out.println(" ");
	}
		
	}
	
}
