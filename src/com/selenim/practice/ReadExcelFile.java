package com.selenim.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		
		
		String excelPath = "./ReadExcel/ReadExcel.xlsx";
		FileInputStream file = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh= wb.getSheetAt(0);
		Row r = sh.getRow(0);
		Cell c = r.getCell(1);
		
		String data= c.getStringCellValue();
		System.out.println(data);
		
		String v=c.toString();
		System.out.println(v);
		
		
		
//		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
//	//	XSSFSheet sheet = workbook.getSheet("Sheet1");
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		int rows = sheet.getLastRowNum();
//		int col = sheet.getRow(1).getLastCellNum();
//		
//		for(int r=0; r<=rows; r++)
//		{
//			XSSFRow row = sheet.getRow(r);
//			for (int c=0; c<=col; c++);
//			{
//			XSSFCell cell = row.getCell(c);	
//			}
//		}
		
	}

}
