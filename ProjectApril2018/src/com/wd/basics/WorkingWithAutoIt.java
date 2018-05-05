package com.wd.basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://opensource.demo.orangehrmlive.com");
		chrome.manage().window().maximize();
		Thread.sleep(2000);
		chrome.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		chrome.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		chrome.findElement(By.cssSelector("input#btnLogin")).click();
		//chrome.findElement(By.cssSelector("input.button")).click();
		chrome.findElement(By.xpath("//a[.='PIM']")).click();
		//chrome.findElement(By.cssSelector("a[id='menu_pim_addEmployee']")).click();
		
		chrome.findElement(By.xpath("//a[text()='Add Employee']")).click();
		chrome.findElement(By.xpath("//input[@id='firstName']")).sendKeys("checking");
		chrome.findElement(By.xpath("//input[@id='lastName']")).sendKeys("cycling");	
		chrome.findElement(By.id("photofile")).click();
		Runtime.getRuntime().exec("D:\\Selenium Jars\\Autoit\\fileuploader.exe");
	}

}
