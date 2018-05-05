package com.wd.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFactory {
     public HashMap<String,String> readtcData(String filename,String sheetname,String testcaseid){
    	 HashMap<String, String> tcmap = new HashMap<String,String>();
    	 try {
			FileInputStream fI = new FileInputStream(filename);	
				XSSFWorkbook wb = new XSSFWorkbook(fI); 
				XSSFSheet sheet =wb.getSheet(sheetname);
				int rc = sheet.getLastRowNum();
				for(int i=1;i<=rc;i++){
					String reqtestcaseid = sheet.getRow(i).getCell(0).toString();
					  if(testcaseid.equalsIgnoreCase(reqtestcaseid)){
						  int cc=sheet.getRow(i).getLastCellNum();
						     for(int j=1;j<cc;j++){
						    	 String key=sheet.getRow(0).getCell(j).toString();
						    	 String value = sheet.getRow(i).getCell(j).toString();
						    	 tcmap.put(key, value);
						     }
					break;
					  }
					  wb.close();
				}
		} catch (FileNotFoundException e) {
			System.out.println("GIven file is not fount in the system");	
		}catch (IOException e) {
			System.out.println(e);
		}
    	 finally{
		   return tcmap;
    	 }
     }
}
