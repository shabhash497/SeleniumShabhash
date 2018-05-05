package com.tng.ohrm;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class OhrmAddEmployee_Report  {
   WebDriver driver;
   ExtentReports report;
   ExtentTest test;
   @BeforeClass
	public void openApplication(){
	     String htmlpath = "D:\\ProjectApril2018\\Results\\+OhrmAddEmployee_Report.html";
	     report = new ExtentReports(htmlpath, true);
	     test = report.startTest("OhrmAddEmp");
		  System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
	        driver=new ChromeDriver();
			driver.get("http://opensource.demo.orangehrmlive.com");
			try{
			assertTrue(driver.getTitle().equalsIgnoreCase("orangehrm"),"TitleVerification");
			test.log(LogStatus.PASS, "OpenApplication", "Application opened successfully");
			}
			catch(AssertionError ae){
				test.log(LogStatus.FAIL, "OpenApplication", "correct page is notopened successfully");
				Assert.fail("Failing since correct page is notopened successfully");
			}
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  @AfterClass
	  public void closeApplication(){
		  driver.quit();
		  report.endTest(test);
		  report.flush();
		  report.close();
	  }

	  @Test
	  public void Login(){
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();	
		  try{
		  assertTrue(CommonMethods.isElementExist(driver,By.xpath("//b[contains(text(),'PIM')]")), "Verifying loginpage");
		  test.log(LogStatus.PASS,"Login", "Add employee page verfication");
		  }catch (AssertionError ae) {
				test.log(LogStatus.FAIL,"Login","verfication failure");
				Assert.fail("verfication failure");
			} catch (NoSuchElementException nse) {
				test.log(LogStatus.FAIL,"Login","Failed due to element now found");
					Assert.fail("locating failure");
			}catch (StaleElementReferenceException ser) {
				test.log(LogStatus.FAIL,"Login","Failed to locate old reference of element");
				Assert.fail("Failed to locate old reference of element");
			}

	  }
	  
	  @Test(dependsOnMethods="Login")
	  public void AddEmployee(){
		  //driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
		  driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Add Emp')]")).click();
		  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("selenium");
		  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("hq");		
		  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		  test.log(LogStatus.PASS,"AddEmployee","Add Employee is successful");
	  }

}
