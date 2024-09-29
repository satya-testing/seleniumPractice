package com.selenim.practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File file = new File("./ReadExcel/ReadExcel.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wbook.getSheetAt(0);
		
	System.out.println(	sheet.getRow(0).getCell(1).getStringCellValue());
		
		
	}

}
