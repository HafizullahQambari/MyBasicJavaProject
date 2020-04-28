package com.syntax.class26;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class FromExcelToMap {
public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\baria\\eclipse-workspace\\JavaBasics\\TestData\\Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
	Sheet sheet=wbook.getSheet("sheet1");
	//to find the number of rows
	int row=sheet.getPhysicalNumberOfRows();
	int cols=sheet.getRow(0).getLastCellNum();
	
	List<Map<String, String>> list=new ArrayList<>();
	
	for(int r=1; r<row; r++) {
		Map<String, String> map=new LinkedHashMap<>();
		for(int c=0; c<cols; c++) {
			String key=sheet.getRow(0).getCell(c).toString();
			String value=sheet.getRow(1).getCell(c).toString();
			map.put(key, value);
		}
		list.add(map);
	}
	System.out.print(list);
}
}
