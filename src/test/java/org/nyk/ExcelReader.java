package org.nyk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClassMethods;

public class ExcelReader extends BaseClassMethods {

	public Workbook excelFileReader() throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\Harish\\Downloads\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(file);
		return wb;
	}

	public String getABrowser() throws IOException, InvalidFormatException {

		Cell browsercell = excelFileReader().getSheetAt(0).getRow(0).getCell(1);

		DataFormatter df = new DataFormatter();
		String browserValue = df.formatCellValue(browsercell);

		return browserValue;

	}

	public String getAUrl() throws IOException, InvalidFormatException {

		Cell urlCell = excelFileReader().getSheetAt(0).getRow(1).getCell(1);

		DataFormatter df = new DataFormatter();
		String urlValue = df.formatCellValue(urlCell);

		return urlValue;

	}

	public String getATitle() throws IOException, InvalidFormatException {

		Cell titleCell = excelFileReader().getSheetAt(0).getRow(2).getCell(1);

		DataFormatter df = new DataFormatter();
		String titleValue = df.formatCellValue(titleCell);

		return titleValue;

	}

	public String getAHimalayaPageTitle() throws IOException, InvalidFormatException {

		Cell himalayaTitleCell = excelFileReader().getSheetAt(0).getRow(3).getCell(1);

		DataFormatter df = new DataFormatter();
		String himalayaTitleValue = df.formatCellValue(himalayaTitleCell);

		return himalayaTitleValue;
	}

	public String getWeight() throws IOException, InvalidFormatException {

		Cell weightCell = excelFileReader().getSheetAt(0).getRow(4).getCell(1);

		DataFormatter df = new DataFormatter();
		String gramValue = df.formatCellValue(weightCell);

		return gramValue;

	}

}
