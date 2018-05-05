package com.files.handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadData_XLS_JXL {

	public static void main(String[] args) throws BiffException, IOException {
		String filename  = "D:/Selenium2018downloads/Files/ExcelFiles/Sample2.xls";
		Workbook wb = Workbook.getWorkbook(new File(filename));
		Sheet sh = wb.getSheet("Sheet1");
		int rc = sh.getRows();
		int cc = sh.getColumns();
		for(int i=0;i<rc;i++){
			for(int j=0;j<cc;j++)
				System.out.println(sh.getCell(j, i).getContents());
		}
      wb.close();
	}

}
