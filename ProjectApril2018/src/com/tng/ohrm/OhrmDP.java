package com.tng.ohrm;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class OhrmDP {
  @DataProvider
  public Object readtcData() throws IOException {
	  String filepath = "D:/Selenium2018downloads/Files/ExcelFiles/Sample3.xlsx";
	  FileInputStream fI = new FileInputStream(filepath);	
		XSSFWorkbook wb = new XSSFWorkbook(fI); 
		XSSFSheet sheet =wb.getSheet("Testdata");
		int rc = sheet.getLastRowNum();
		System.out.println("No fo rows is "+rc);
		Object tcdata[][] = new Object[rc][1];
		for(int i=1;i<=rc;i++){
			HashMap<String,String> tcmap = new HashMap<String,String>();
			int cc = sheet.getRow(i).getLastCellNum();
			for(int j=1;j<cc;j++){
				String key = sheet.getRow(0).getCell(j).toString();
				String value = sheet.getRow(i).getCell(j).toString();
				tcmap.put(key, value);
			}
			tcdata[i-1][0]=tcmap;
			System.out.println(tcdata[i-1][0]);
			tcmap.clear();
		}
		wb.close();
		System.out.println(tcdata);
		return tcdata;
  }
}
