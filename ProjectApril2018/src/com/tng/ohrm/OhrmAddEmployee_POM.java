package com.tng.ohrm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.OhrmIntPOM;

public class OhrmAddEmployee_POM {
 OhrmIntPOM ohrm;
	@BeforeClass
public void openApplication() throws InterruptedException{
	 ohrm= new OhrmIntPOM();
		ohrm.openApplication();
		
}
@AfterClass
public void closeApplication(){
	  ohrm.closeApplication();
}
@Test
public void Login(){
	  ohrm.loginPage.enterTextUserName("Admin");
	  ohrm.loginPage.enterTextOnPassword("admin");
		ohrm.loginPage.clickOnLoginButton();
}
@Test(dependsOnMethods="Login")
public void AddEmployee() throws InterruptedException{
	  Thread.sleep(2000);
	  ohrm.welcomePage.clickOnPIMLink();
		ohrm.welcomePage.clickOnAddEmployeeLink();
		ohrm.addEmpPage.enterTextOnFirstName("selenium");
		ohrm.addEmpPage.enterTextOnLastName("hq");
		ohrm.addEmpPage.clickOnSaveButton();
}

}
  