package com.newconcepts.practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.navigate().to("https://makemysushi.com/404?");
		driver.manage().window().maximize();
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Number of Links & images in this page" + linkslist.size());
		ArrayList<String> activelinksurl = new ArrayList<String>();
		for(int i=0;i<linkslist.size();i++){
			String hrefvalue = linkslist.get(i).getAttribute("href");
			   if(hrefvalue!=null && (!hrefvalue.contains("javascript")) && (hrefvalue.startsWith("https"))){
				   activelinksurl.add(hrefvalue);
			   }
			
		}
		System.out.println("Total Number of valid Links & images in this page" + activelinksurl.size());
		for(int j=0;j<activelinksurl.size();j++){
			System.out.println(j + " "+ activelinksurl.get(j));
			HttpURLConnection connection = (HttpURLConnection)new URL(activelinksurl.get(j)).openConnection();
			connection.connect();
			Integer statuscode  = connection.getResponseCode();
			if(statuscode>400){
				System.out.println("This is a broken link "+ activelinksurl.get(j) );
			}
		
		}
	}

}

