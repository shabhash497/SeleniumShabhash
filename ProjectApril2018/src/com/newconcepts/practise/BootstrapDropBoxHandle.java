package com.newconcepts.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=167.0_1");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.tagName("button")).click();
		List<WebElement> dropoptions =  driver.findElements(By.xpath("//ul[@class='dropdown-menu inner']//li/a"));
		System.out.println(dropoptions.size());
		for(int i=0;i<dropoptions.size();i++){
			System.out.println(dropoptions.get(i).getText());
			if(dropoptions.get(i).getText().contains("Bootstrap")){
				dropoptions.get(i).click();
			 break;
			}
		}

	}

}
