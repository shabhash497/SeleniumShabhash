package com.tng.ohrm;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.OhrmIntPOM;

public class OhrmAddEmployee_Exceptions {
	WebDriver driver;
	@BeforeClass
	public void openApplication(){
		  System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
	        driver=new ChromeDriver();
			driver.get("http://opensource.demo.orangehrmlive.com");
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			try{
			assertTrue(driver.getTitle().equalsIgnoreCase("orangehrml"),"Title Verification");
			}
			catch(AssertionError ae){
				System.out.println("correct page is not opened in Application ");
				Assert.fail("correct page is not opened in Application");

			}
			
	  }
	  @AfterClass
	  public void closeApplication(){
		  driver.quit();
	  }
	  @Test
	  public void Login(){
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();	  
	  }
	  
	  @Test(dependsOnMethods="Login")
	  public void AddEmployee(){
		  //driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
		  driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Add Emp')]")).click();
		  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("selenium");
		  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("hq");		
		  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	  }

}
  