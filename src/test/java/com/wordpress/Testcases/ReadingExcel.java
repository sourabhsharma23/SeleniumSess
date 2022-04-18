package com.wordpress.Testcases;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingExcel {

	@Test
	public void readExcel() throws IOException {
		
		File file = new File("/Users/labuser/Documents/Countries.xlsx");

			FileInputStream fis = new FileInputStream(file);
	
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(rows).getLastCellNum();
		
		
		for(int i=0;i<=rows;i++) 
		{
			XSSFRow realrow=sheet.getRow(i);
			for(int j=0;j<cols;j++) {
				
				XSSFCell realcol=realrow.getCell(j);
				
				switch(realcol.getCellType())
				{
				case STRING: System.out.println(realcol.getStringCellValue()); break;
				case NUMERIC: System.out.println(realcol.getNumericCellValue()); break;
				case BOOLEAN: System.out.println(realcol.getBooleanCellValue()); break;
				
				}
				
			}
			System.out.println();
			
		}
		
		
	}
	
}
