package com.tng.ohrm;

import java.util.HashMap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.OhrmIntPOM;

public class OhrmAddEmployee_POM_DDT {
 OhrmIntPOM ohrm;
 HashMap<String, String> tcdata;
	@BeforeClass
public void openApplication() throws InterruptedException{
	 ohrm= new OhrmIntPOM();
		ohrm.openApplication();
		String filepath = "D:/Selenium2018downloads/Files/ExcelFiles/Sample3.xlsx";
		tcdata = ohrm.datafactrypage.readtcData(filepath, "Testdata", "TC_03");
		
}
@AfterClass
public void closeApplication(){
	  ohrm.closeApplication();
}
@Test
public void Login(){
	  ohrm.loginPage.enterTextUserName(tcdata.get("username"));
	  ohrm.loginPage.enterTextOnPassword(tcdata.get("password"));
		ohrm.loginPage.clickOnLoginButton();
}
@Test(dependsOnMethods="Login")
public void AddEmployee() throws InterruptedException{
	  Thread.sleep(2000);
	  ohrm.welcomePage.clickOnPIMLink();
		ohrm.welcomePage.clickOnAddEmployeeLink();
		ohrm.addEmpPage.enterTextOnFirstName(tcdata.get("firstname"));
		ohrm.addEmpPage.enterTextOnLastName(tcdata.get("lastname"));
		ohrm.addEmpPage.clickOnSaveButton();
}

}
  