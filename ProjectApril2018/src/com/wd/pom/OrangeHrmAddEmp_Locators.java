package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmAddEmp_Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(OhrmLoc.txt_LoginPage_UserName).sendKeys("Admin");
		driver.findElement(OhrmLoc.txt_LoginPage_Password).sendKeys("admin");
		driver.findElement(OhrmLoc.btn_LoginPage_Login).click();
		driver.findElement(OhrmLoc.lnk_WelcomePage_PIM).click();
		driver.findElement(OhrmLoc.lnk_WelcomePage_AddEmployee).click();
		driver.findElement(OhrmLoc.txt_AddEmpPage_FirstName).sendKeys("Shabha");
		driver.findElement(OhrmLoc.txt_AddEmpPage_LastName).sendKeys("Shaik");
		driver.findElement(OhrmLoc.btn_AddEmpPage_Save).click();
		driver.close();
		driver.quit();

	}

}
