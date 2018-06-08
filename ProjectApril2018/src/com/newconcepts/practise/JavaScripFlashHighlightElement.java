package com.newconcepts.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScripFlashHighlightElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
		flash(loginbutton, driver);
		drawBorder(loginbutton, driver);
		Thread.sleep(2000);
		//generateAlert("Bug in Login button",driver);
		System.out.println(getTitleJS(driver));
		System.out.println(getInnerTextOfPageJS(driver));
		//scrollPagedown(driver);
		WebElement lstelemnt = driver.findElement(By.xpath("//input[@value='Login']"));
		scrollToElement(driver, lstelemnt);
		
	}
    public static void flash(WebElement element,WebDriver driver){
    	String bgcolor = element.getCssValue("backgroundColor");
    	for(int i=0;i<10;i++){
    		changeColor("rgb(0,200,0)", element, driver);
    		changeColor(bgcolor, element, driver);
    	}
    }
	
    public static void changeColor(String color,WebElement element,WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
    	try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
		}
    }
    public static void drawBorder(WebElement element,WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].style.border='5px solid red'", element);
    	
    }
    public static void generateAlert(String message,WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("alert('"+message+"')");
    	
    }
    public static String getTitleJS(WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	String str = (js.executeScript("return document.title;")).toString();
    	return str;
    }
    public static String getInnerTextOfPageJS(WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	String str = (js.executeScript("return document.documentElement.innerText;")).toString();
    	return str;
    }
    public  static void scrollPagedown(WebDriver driver){
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }
    public  static void scrollToElement(WebDriver driver,WebElement elemnt){
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", elemnt);
    }
    
}
