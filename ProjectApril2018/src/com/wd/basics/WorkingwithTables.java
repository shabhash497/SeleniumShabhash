package com.wd.basics;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithTables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Thread.sleep(1000);
       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginbutton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		Thread.sleep(1000);
		WebElement table= driver.findElement(By.id("resultTable"));
		List<WebElement> tbrows =  table.findElements(By.tagName("tr"));
		System.out.println(tbrows.size());
        for(int i=1;i<tbrows.size();i++){
        	List<WebElement> tbdata= tbrows.get(i).findElements(By.tagName("td"));
        	//System.out.println(tbdata.size());
        	System.out.println(tbdata.get(2).getText());
        }
	}

}
