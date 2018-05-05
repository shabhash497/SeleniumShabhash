package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmpPagePOM {
	  WebDriver driver;
	  AddEmpPagePOM(WebDriver driver){
		  this.driver=driver;
	  }
	//identification methods
		public WebElement txtFirstName(){		
			return driver.findElement(By.xpath("//input[@id='firstName']"));
		}
		public WebElement txtLastName(){
			return driver.findElement(By.xpath("//input[@id='lastName']"));
		}
		public WebElement btnSave(){
			return driver.findElement(By.xpath("//input[@id='btnSave']"));
		}
		//operating methods
		public void enterTextOnFirstName(String txtToEnter){
			txtFirstName().sendKeys(txtToEnter);
			System.out.println(txtToEnter+" entered on FirstName TextBox");
		}
		
		public void enterTextOnLastName(String txtToEnter){
			txtLastName().sendKeys(txtToEnter);
			System.out.println(txtToEnter+" entered on LastName TextBox");
		}
		
		public void clickOnSaveButton(){
			btnSave().click();
			System.out.println("Clicked on Save Button");
		}
	}

