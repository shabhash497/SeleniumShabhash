package com.tng.ohrm;
import com.wd.pom.OhrmIntPOM;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		String filepath = "D:/Selenium2018downloads/Files/ExcelFiles/Sample3.xlsx";
		OhrmIntPOM ohrm = new OhrmIntPOM();
		ohrm.openApplication();
		System.out.println(ohrm.datafactrypage.readtcData(filepath, "Testdata", "TC_01"));
		

	}

}
