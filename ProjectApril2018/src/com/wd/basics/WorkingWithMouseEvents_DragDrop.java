package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class WorkingWithMouseEvents_DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://jqueryui.com/droppable/");
		chrome.manage().window().maximize();
		chrome.switchTo().frame(chrome.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement src= chrome.findElement(By.id("draggable"));
		WebElement dst=chrome.findElement(By.id("droppable"));
		Actions act = new Actions(chrome);
		//act.dragAndDrop(src, dst);
		act.clickAndHold(src).moveToElement(dst).release().build().perform();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(chrome)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>()
			   {
			     public WebElement apply(WebDriver chrome) 
			     {
			       return chrome.findElement(By.id("foo"));
			     }
			   });
	}

}
