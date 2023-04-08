package org.kkk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\AnytimePractise\\Excel\\New Microsoft Excel Worksheet.xlsx");
		
		Workbook workbook =new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("java");
		
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("javaselenium");
		
		Cell cell2 = row.createCell(1);
		cell2.setCellValue("krish");
		
		Row row2 = sheet.createRow(1);
		Cell cell3 = row2.createCell(0);
		cell3.setCellValue("krish");
		
		Row row3 = sheet.createRow(2);
		Cell cell4 = row3.createCell(0);
		cell4.setCellValue("raja");
		
		
		FileOutputStream stream=new FileOutputStream(file);
		
		workbook.write(stream);
		
		
		
		
		
		
	}
	

	
}
