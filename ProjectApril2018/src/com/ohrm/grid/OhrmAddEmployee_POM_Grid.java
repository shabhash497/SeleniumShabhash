package com.ohrm.grid;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.wd.pom.OhrmIntPOMRemote;
public class OhrmAddEmployee_POM_Grid {
  OhrmIntPOMRemote ohrm;
  @BeforeClass
  @Parameters({"brName","appUrl","nodeUrl"})
public void openApplication(String brtype,String applink,String nurl) throws MalformedURLException{
	 ohrm= new OhrmIntPOMRemote();
		ohrm.openApplicationinRemote(brtype, applink, nurl);
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
