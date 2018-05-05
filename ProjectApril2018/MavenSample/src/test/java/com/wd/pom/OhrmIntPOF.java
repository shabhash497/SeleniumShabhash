package com.wd.pom;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OhrmIntPOF {
 WebDriver driver;
 public LoginPagePOF loginPage;
 public WelcomePagePOF welcomePage;
 public AddEmpPagePOF addEmpPage;
 //public DataFactory datafactrypage;
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
	 loginPage = new LoginPagePOF(driver);
     welcomePage = new WelcomePagePOF(driver);
	addEmpPage = new AddEmpPagePOF(driver);
}
 public void closeApplication(){
		driver.quit();
		System.out.println("Application is closed");
	}


}
