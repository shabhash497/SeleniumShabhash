package com.wd.basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {
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
	    chrome.switchTo().frame(frame);
	    Thread.sleep(1000);
	    String strMWndHandle = chrome.getWindowHandle();
	    System.out.println(strMWndHandle);
	    System.out.println(chrome.getTitle());
	    Thread.sleep(1000);
	    chrome.findElement(By.xpath("//button[text()='Sign in with Facebook']")).click();
	    chrome  = switchToWIndowByTitle(chrome,"Facebook");
	    chrome.findElement(By.id("email")).sendKeys("abc@gmail.com");
		chrome.close();
		chrome.switchTo().window(strMWndHandle);
		chrome.switchTo().frame(frame);
		Thread.sleep(1000);
		chrome.findElement(By.xpath("//button[text()='signup with email']")).click();
	}
	    public static WebDriver switchToWIndowByTitle(WebDriver driver,String windowTitle)
	    {
	    	Set<String> windohndls = driver.getWindowHandles();
	    	for(String str:windohndls){
	    		driver.switchTo().window(str);
	    		if(driver.getTitle().equalsIgnoreCase(windowTitle)){
	    			System.out.println("Switched to window with title "+windowTitle);
	    			break;
	    		}
	    	}
	    return driver;
	}

}
