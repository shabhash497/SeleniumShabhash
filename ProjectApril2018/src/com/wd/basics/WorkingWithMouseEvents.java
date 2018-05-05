package com.wd.basics;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMouseEvents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[.='PIM']"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Add Emp')]")).click();
		driver.findElement(By.name("firstName")).sendKeys("sudhakar");
		driver.findElement(By.name("lastName")).sendKeys("k");
		driver.findElement(By.cssSelector("#btnSave")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

}
