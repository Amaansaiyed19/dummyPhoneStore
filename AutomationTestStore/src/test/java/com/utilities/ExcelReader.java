package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static Object[][] getExcelData(String filePath, String sheetName) throws InvalidFormatException, IOException{
		
		
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\DummyPhoneWebsite.xlsx";
		
		File file = new File(path);
		
		FileInputStream fileInput = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][] data = new Object[rows - 1][cols];
		//row = i and cols = j
		for (int i = 1; i < rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		
		
		workbook.close();
		fileInput.close();
		return data;
		
	}

}
