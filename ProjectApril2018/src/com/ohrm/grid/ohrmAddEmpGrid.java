package com.ohrm.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ohrmAddEmpGrid {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver chrome  = new RemoteWebDriver(new URL("http://192.168.1.4:5555/wd/hub/"), DesiredCapabilities.chrome());
		chrome.get("http://opensource.demo.orangehrmlive.com");
		chrome.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		chrome.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		chrome.findElement(By.xpath("//input[@value='LOGIN']")).click();
		chrome.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		chrome.findElement(By.xpath("//a[text()='Add Employee']")).click();
		chrome.findElement(By.xpath("//input[@id='firstName']")).sendKeys("selenium");
		chrome.findElement(By.xpath("//input[@id='lastName']")).sendKeys("hq");		
		chrome.findElement(By.xpath("//input[@id='btnSave']")).click();
		
	}

}
