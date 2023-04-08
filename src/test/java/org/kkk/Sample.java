package org.kkk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		File file =new File("C:\\Users\\ADMIN\\eclipse-workspace\\AnytimePractise\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
	FileInputStream	 stream =new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		 Sheet sheet = workbook.getSheet("Sheet1"); 
		 int rowcount = sheet.getPhysicalNumberOfRows();
		  System.out.println(rowcount);
		  
	      Row row = sheet.getRow(5);
		  int cellcount = row.getPhysicalNumberOfCells();
	      System.out.println(cellcount);
		  
		  
	//	  for (int i = 0; i <row.getPhysicalNumberOfCells(); i++) {		  
	//		  Cell cell = row.getCell(i);
	//	  System.out.println(cell);
			
	//	}
		  for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row2.getCell(j);	
			
			
			System.out.println(cell);
			
			}
		
			 
		}
		  
		 
		  
		  
		  
		  
		 
		
		
	}
	
		
	}
	
	

