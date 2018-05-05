package com.wd.pom;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.SystemProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OhrmIntPOM {
 WebDriver driver;
 public LoginPagePOM loginPage;
 public WelcomePagePOM welcomePage;
 public AddEmpPagePOM addEmpPage;
 public DataFactory datafactrypage;
 public void openApplication() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		initPageClasses();
 }
 private  void initPageClasses(){
	 loginPage = new LoginPagePOM(driver);
     welcomePage = new WelcomePagePOM(driver);
	addEmpPage = new AddEmpPagePOM(driver);
	datafactrypage = new DataFactory();
}
 public void closeApplication(){
		driver.quit();
		System.out.println("Application is closed");
	}


}
