package com.syntax.class26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"\\TestData\\Practice.xlsx/";
		System.out.println(filePath);
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		sheet.getRow(0).getCell(5).setCellValue("GrandFatherName");
		sheet.createRow(6).createCell(0).setCellValue("Sama");
		
		
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		wbook.write(fos);
		
		int row=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		
		List<Map<String, String>> list=new ArrayList<>();
		
		for(int r=0; r<row; r++) {
			Map<String, String> map=new LinkedHashMap<>();
			for(int c=0; c<cols; c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(0).getCell(c).toString();
				map.put(key, value);
			}
			list.add(map);
		}
		System.out.println(list);
		
	}

}
