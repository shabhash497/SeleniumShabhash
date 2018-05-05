package com.files.handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_XLXS_POI {

	public static void main(String[] args) throws IOException{
		File ff = new File("D:/Selenium2018downloads/Files/ExcelFiles/Sample1.xlsx");
		FileInputStream fi =  new FileInputStream(ff);
		FileOutputStream fo = new FileOutputStream(ff);
		XSSFWorkbook xwb = new XSSFWorkbook(fi);
		XSSFSheet sht = xwb.getSheet("Sheet1");
		sht.getRow(0).createCell(1).setCellValue("Pass");
		xwb.write(fo);
		xwb.close();

	}

}
