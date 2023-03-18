package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		
		
		/*
		FileInputStream file=new FileInputStream("./src/com/Excel/File.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet3");
		Row row=sheet.getRow(6);
		Cell cell=row.getCell(8);
		String data=cell.getStringCellValue();
		System.out.println(data);
		*/
		
		
		FileInputStream file=new FileInputStream("./src/com/Excel/File.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet2");
		Row row=sheet.createRow(6);
		Cell cell=row.createCell(9);
		String data=cell.getStringCellValue();
		System.out.println(data);
		cell.setCellValue("daddy");
		FileOutputStream file1=new FileOutputStream("./src/com/Excel/File.xlsx");
		workbook.write(file1);
		
	
		
		

	}

}
