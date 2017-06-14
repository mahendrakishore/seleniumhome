package com.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	XSSFWorkbook wb ;
	
	public ExcelReader(String path){
		try {File file = new File(path);
		FileInputStream   fis  = new FileInputStream(file);	
			wb  = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception in execel file");
		}	}
	
	public String getExcelData(int sheetnum,int rownum, int colnum){
		String exceldata = wb.getSheetAt(sheetnum).getRow(rownum).getCell(colnum).getStringCellValue();
				return exceldata;
	}
	
	public int rowCount(int sheetnum){
	int	rowcount = wb.getSheetAt(sheetnum).getLastRowNum();
		rowcount = rowcount+1;
		return rowcount;
	}

}
