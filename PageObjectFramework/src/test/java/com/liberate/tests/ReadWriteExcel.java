package com.liberate.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub-- "C:\\Users\\namarri\\Desktop\\SeleniumFiles\\MasterTestDataFile.xlsx"
		
		FileInputStream ExecelFileStream= new FileInputStream("C:\\Users\\namarri\\Desktop\\SeleniumFiles\\MasterTestDataFile.xlsx");
		Workbook ExcelFile=new WorkbookFactory().create(ExecelFileStream);
		Sheet testDataSheet=ExcelFile.getSheet("TestCaseDataSets");
		String cell2B=testDataSheet.getRow(1).getCell(1).toString();
		String cell2C=testDataSheet.getRow(1).getCell(2).toString();
		System.out.println(cell2B);
		System.out.println(cell2C);
		
		//insert a new cell value
		testDataSheet.getRow(1).createCell(3).setCellValue("Hello");
		//update an existing cell value
		testDataSheet.getRow(1).getCell(3).setCellValue("Hello44");
		//create a new test sheet and write a value into cell
		ExcelFile.createSheet("TestSheet4").createRow(4).createCell(3).setCellValue("This created from Selenium");
		FileOutputStream excelWriteStream=new FileOutputStream("C:\\Users\\namarri\\Desktop\\SeleniumFiles\\MasterTestDataFile.xlsx");
		ExcelFile.write(excelWriteStream);
		excelWriteStream.close();
		
		ExcelFile.close();
		ExecelFileStream.close();
			

	}

}
