package com.wd.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithElements_FileInputsSimple {

	public static void main(String[] args) throws InterruptedException {
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
		//In order to get text from webelement use webelement.gettText() method
		//chrome.findElement(By.xpath("//a[text()='Add Employee']")).getText();
		chrome.findElement(By.xpath("//a[text()='Add Employee']")).click();
		chrome.findElement(By.xpath("//input[@id='firstName']")).sendKeys("checking");
		chrome.findElement(By.xpath("//input[@id='lastName']")).sendKeys("cycling");	
		chrome.findElement(By.id("photofile")).sendKeys("C:/Users/ss00359827/Desktop/PICS/Close.JPG");

	}

}
