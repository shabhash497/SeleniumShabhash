package com.files.handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_XLXS_POI {

	public static void main(String[] args) throws IOException{
		FileInputStream fl = new FileInputStream("D:/Selenium2018downloads/Files/ExcelFiles/Sample1.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook(fl);
		XSSFSheet sht = xwb.getSheet("Sheet1");
		int rc = sht.getLastRowNum();
		//System.out.println(rc);
		for(int i=1;i<=rc;i++){
			int cc = sht.getRow(i).getLastCellNum();
			for(int j=0;j<cc;j++){
				System.out.println(sht.getRow(i).getCell(j).toString());
			}
		}
		

	}

}
