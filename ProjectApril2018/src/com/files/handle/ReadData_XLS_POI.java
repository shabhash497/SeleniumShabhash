package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData_XLS_POI {

	public static void main(String[] args) throws IOException {
		FileInputStream fl = new FileInputStream("D:/Selenium2018downloads/Files/ExcelFiles/Sample2.xls");
		HSSFWorkbook wb = new HSSFWorkbook(fl);
		HSSFSheet sht = wb.getSheet("Sheet1");
		int rc = sht.getLastRowNum();
		for(int i=1;i<=rc;i++){
			int cc = sht.getRow(i).getLastCellNum();
			for(int j=0;j<cc;j++){
				System.out.println(sht.getRow(i).getCell(j).toString());
			}
		}
		wb.close();

	}

}
