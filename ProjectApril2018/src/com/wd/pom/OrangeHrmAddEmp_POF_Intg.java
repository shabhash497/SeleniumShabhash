package com.wd.pom;

public class OrangeHrmAddEmp_POF_Intg {

	public static void main(String[] args) throws InterruptedException {
		OhrmIntPOF ohrm = new OhrmIntPOF();
		ohrm.openApplication();
		ohrm.loginPage.enterTextOnUserName("Admin");
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
