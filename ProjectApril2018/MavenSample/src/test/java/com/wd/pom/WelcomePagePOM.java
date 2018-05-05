package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePagePOM {
WebDriver driver;
     WelcomePagePOM(WebDriver driver){
    	 this.driver=driver;
     }
     public WebElement lnkPIM(){
 		return driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
 	}
 	
 	public WebElement lnkAddEmployee(){
 		return driver.findElement(By.xpath("//a[text()='Add Employee']"));
 	}
 	
 	//operating methods
 	
 	public void clickOnPIMLink(){
 		lnkPIM().click();
 		System.out.println("Clicked on PIM link");
 	}
 	
 	public void clickOnAddEmployeeLink(){
 		lnkAddEmployee().click();
 		System.out.println("Clicked on AddEmployee link");
 	}
}

