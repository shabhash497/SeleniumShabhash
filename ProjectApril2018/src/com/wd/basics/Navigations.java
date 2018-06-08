package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		chrome.navigate().to("http://opensource.demo.orangehrmlive.com");
		//chrome.get("http://opensource.demo.orangehrmlive.com");
		chrome.manage().window().maximize();
		Thread.sleep(2000);
		chrome.navigate().to("http://google.co.in");
		Thread.sleep(2000);
		chrome.navigate().back();
		Thread.sleep(2000);
		chrome.navigate().forward();
		//to refersh page
		chrome.navigate().refresh();
	}

}
