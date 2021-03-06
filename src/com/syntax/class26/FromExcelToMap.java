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
		
		String filePath=System.getProperty("user.dir")+"\\TestData\\practice2.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheet=wb.getSheet("Sheet1");
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getLastCellNum();
		
		List<Map<String, String>> list=new ArrayList<>();
		
		for(int r=1; r<row; r++) {
			
		Map<String, String> map=new LinkedHashMap<>();
		for(int c=0; c<col; c++) {
			
			String key=sheet.getRow(0).getCell(c).toString();
			String value=sheet.getRow(r).getCell(c).toString();
			map.put(key, value);
		}
		list.add(map);
		}
		System.out.print(list+" ");
}

}
