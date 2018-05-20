package com.wd.basics;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchingBetweenTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		chrome.get("http://opensource.demo.orangehrmlive.com");
		chrome.manage().window().maximize();
		Thread.sleep(2000);
		//chrome.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		Actions action= new Actions(chrome);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	}

}
