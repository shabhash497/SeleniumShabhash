package com.tng.ohrm;

import java.util.HashMap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.OhrmIntPOM;

public class OhrmAddEmployee_POM_DDTMultiple {
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
@Test(dependsOnMethods="Login",dataProvider="readtcData",dataProviderClass=OhrmDP.class)
public void AddEmployee(HashMap<String,String> tcMap) throws InterruptedException{
	  Thread.sleep(2000);
	  System.out.println(tcMap);
	  ohrm.welcomePage.clickOnPIMLink();
		ohrm.welcomePage.clickOnAddEmployeeLink();
		ohrm.addEmpPage.enterTextOnFirstName(tcMap.get("firstname"));
		ohrm.addEmpPage.enterTextOnLastName(tcMap.get("lastname"));
		ohrm.addEmpPage.clickOnSaveButton();
}

}
  