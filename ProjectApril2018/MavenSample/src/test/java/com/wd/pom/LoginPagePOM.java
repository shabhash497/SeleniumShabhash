package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePOM {
	WebDriver driver;
	public LoginPagePOM(WebDriver driver) {
		this.driver=driver;
	}
	//object identification methods
	public WebElement txtUsername(){
		return driver.findElement(By.xpath("//input[@id='txtUsername']"));
	}
	public WebElement txtPassword(){
		return driver.findElement(By.xpath("//input[@id='txtPassword']"));
	}
	public WebElement btnLogin(){
		return driver.findElement(By.xpath("//input[@value='LOGIN']"));
	}
	//operation methos
	public void enterTextUserName(String txttoEnter){
		txtUsername().sendKeys("Admin");
		System.out.println(txttoEnter+" entered on UserName TextBox");
	}
	public void enterTextOnPassword(String txttoEnter){
		txtPassword().sendKeys("admin");
	}
	public void clickOnLoginButton(){
		btnLogin().click();
		System.out.println("Clicked on Login Button");
	}

}
