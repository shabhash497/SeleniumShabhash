package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithFrames {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://www.redbus.in/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		chrome.findElement(By.id("signin-block")).click();
		chrome.findElement(By.id("signInLink")).click();
		System.out.println(chrome.findElements(By.tagName("iframe")).size());
		WebElement frame = chrome.findElement(By.xpath("//iframe[@class='modalIframe' and not(ancestor-or-self::*[contains(@class,'hide')])]"));
		boolean check = chrome.findElements(By.xpath("//iframe[@class='modalIframe' and not(ancestor-or-self::*[contains(@class,'hide')])]")).size()>0;
		System.out.println(check);
	    chrome.switchTo().frame(frame);
		chrome.findElement(By.xpath("//button[text()='signup with email']")).click();
		chrome.findElement(By.id("emailID")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		/*Screen scr =  new Screen();
        try {
			scr.click("D:\\Selenium Jars\\Sikuli setup\\Close.JPG");
		} catch (FindFailed e) {
			System.out.println(e);
		}*/
        chrome.switchTo().defaultContent();
        chrome.findElement(By.xpath("//a[.='HOTELS ']")).click();
        chrome.close();
        chrome.quit();
	}

}