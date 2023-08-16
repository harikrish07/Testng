package org.nykaa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	private void excelReader() throws IOException {
		File file = new File("C:\\Users\\Harish\\Downloads\\alldata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook xs = new XSSFWorkbook(fis);
		Sheet sheetAt = xs.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("with Header Count :" + numberOfRows);
		
		int lastRowNum = sheetAt.getLastRowNum();
		int lastCellNum = sheetAt.getRow(0).getLastCellNum();
		
		System.out.println("Last Row Number :" +lastRowNum);
		System.out.println("Last cell Number :" +lastCellNum);
		
		for(int i = 1; i<=lastRowNum; i++) {
			for(int j = 0; j<lastCellNum; j++) {
				Cell cell = sheetAt.getRow(i).getCell(j);
				DataFormatter data = new DataFormatter();
				String formatCellValue = data.formatCellValue(cell);
				System.out.println(formatCellValue);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		ExcelData ne = new ExcelData();
		ne.excelReader();
	}

}















/*POM and its Advantage

	1. POM.XML
	     POM.XML is a place were we used to add and maintain a mvn dependencies 
	2. POM class
	  	Each and every webpage are maintained as separate class in POM so that code update and maintenance is easy
	3. POM (Page object Manager)
		It's a single class which connects all POM classes in a single class
*/























