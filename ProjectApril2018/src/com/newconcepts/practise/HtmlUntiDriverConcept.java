package com.newconcepts.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUntiDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		//html unit driver is not available in Selenium 3.x version
		//htmlunit driver to use this concept ,we have to download htmlunit driver jar file.
		//Advantages
		//1,Testing is happening behind the scene no browser is launched
		//2.very fast-execution of test cases is very fast since it doen,t open any browser
		//3.not suitable for action class --user action like mouse movement,drag and drop we  can't automate using htmlunitdriver
		//4.HtmlUnitDriver is also called as HeadlessBrowser ,GhostBrowser
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginbutton.click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.close(); 

	}

}
