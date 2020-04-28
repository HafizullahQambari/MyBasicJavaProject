package com.syntax.class26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"\\TestData\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		// writing into existing sheet
		Sheet sheet=wbook.getSheet("sheet1");
		sheet.getRow(0).getCell(4).setCellValue("country");
		sheet.createRow(4).createCell(0).setCellValue("Hafiz");
		Sheet newsheet=wbook.createSheet("sheet333");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		wbook.write(fos);
		
	}

}
