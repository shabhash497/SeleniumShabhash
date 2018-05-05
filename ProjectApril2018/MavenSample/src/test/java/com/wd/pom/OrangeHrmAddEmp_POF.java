package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmAddEmp_POF {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		LoginPagePOF loginpage = new LoginPagePOF(driver);
		loginpage.enterTextOnUserName("Admin");
		loginpage.enterTextOnPassword("admin");
		loginpage.clickOnLoginButton();
		WelcomePagePOF wlcmpg=new WelcomePagePOF(driver);
		wlcmpg.clickOnPIMLink();
		wlcmpg.clickOnAddEmployeeLink();
        AddEmpPagePOF addemp= new AddEmpPagePOF(driver);
        addemp.enterTextOnFirstName("selenium");
        addemp.enterTextOnLastName("edookati");
        addemp.clickOnSaveButton();
	}

}
