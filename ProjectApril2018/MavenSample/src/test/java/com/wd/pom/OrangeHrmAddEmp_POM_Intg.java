package com.wd.pom;

public class OrangeHrmAddEmp_POM_Intg {

	public static void main(String[] args) throws InterruptedException {
		OhrmIntPOM ohrm = new OhrmIntPOM();
		ohrm.openApplication();
		ohrm.loginPage.enterTextUserName("Admin");
		ohrm.loginPage.enterTextOnPassword("admin");
		ohrm.loginPage.clickOnLoginButton();
		ohrm.welcomePage.clickOnPIMLink();
		ohrm.welcomePage.clickOnAddEmployeeLink();
		ohrm.addEmpPage.enterTextOnFirstName("selenium");
		ohrm.addEmpPage.enterTextOnLastName("hq");
		ohrm.addEmpPage.clickOnSaveButton();	
		ohrm.closeApplication();

	}

}
