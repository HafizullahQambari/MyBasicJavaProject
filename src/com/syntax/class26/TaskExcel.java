package com.syntax.class26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TaskExcel {
	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\baria\\eclipse-workspace\\JavaBasics\\TestData\\Task.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		double cols=sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r<rows; r++) {
			for(int c=0; c<cols; c++) {
				String values=sheet.getRow(r).getCell(c).toString();
				System.out.print(values+" ");
			}
			System.out.println();
		}
		
	}

}
