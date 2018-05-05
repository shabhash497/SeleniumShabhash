package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmAddEmp_POM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		LoginPagePOM loginpage  = new LoginPagePOM(driver);
		loginpage.enterTextUserName("Admin");
		loginpage.enterTextOnPassword("admin");
		loginpage.clickOnLoginButton();
		WelcomePagePOM welcmpage = new WelcomePagePOM(driver);
		welcmpage.clickOnPIMLink();
		welcmpage.clickOnAddEmployeeLink();
		AddEmpPagePOM addempage = new AddEmpPagePOM(driver);
		addempage.enterTextOnFirstName("Cherry");
		addempage.enterTextOnLastName("Darling");
		addempage.clickOnSaveButton();

	}

}
