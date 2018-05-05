package com.wd.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class WelcomePagePOF {
	     WelcomePagePOF(WebDriver driver){
	    	 PageFactory.initElements(driver, this);
	     }
	    
	     @FindBy(xpath="//a[@id='menu_pim_viewPimModule']") WebElement lnkPIM;
	    @FindBy(xpath="//a[text()='Add Employee']") WebElement lnkAddEmployee;
	 	
	 	//operating methods
	 	
	 	public void clickOnPIMLink(){
	 		lnkPIM.click();
	 		System.out.println("Clicked on PIM link");
	 	}
	 	
	 	public void clickOnAddEmployeeLink(){
	 		lnkAddEmployee.click();
	 		System.out.println("Clicked on AddEmployee link");
	 	}
	}
