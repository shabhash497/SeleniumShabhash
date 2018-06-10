package com.newconcepts.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("windows-size=1400,800");
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
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
