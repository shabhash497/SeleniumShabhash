package com.wd.basics;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithElementsUsingJavaScript_Highlighting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement username=driver.findElement(By.id("txtUsername"));
		js.executeScript("arguments[0].focus;", username);
		WebElement password  = (WebElement)js.executeScript("return document.getElementById('txtPassword');");
		js.executeScript("arguments[0].value='Admin';arguments[1].value='admin'", username,password);
		driver.findElement(By.id("btnLogin")).click();
		js.executeScript("alert('Hi Shabhash this is alert')");
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		driver.close();
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(arg0), null);
	}

}
