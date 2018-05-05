package com.wd.basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WbdriverWaits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Selenium2018downloads/Browserdrivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://landfill.bugzilla.org/bugzilla-5.0-branch/");
        driver.manage().window().maximize();
        //implicitly wait
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 120);
        WebElement search =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("find_top")));
        search.click();
        Wait fwait = new FluentWait(driver).withTimeout(120,TimeUnit.SECONDS).pollingEvery(10,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        Thread.sleep(1000);
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
        Thread.sleep(1000);
        driver.close();
	}

}
