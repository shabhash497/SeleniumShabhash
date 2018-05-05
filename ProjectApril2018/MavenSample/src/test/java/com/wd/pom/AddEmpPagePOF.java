package com.wd.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPagePOF {
	  
	  AddEmpPagePOF(WebDriver driver){
		  PageFactory.initElements(driver, this);
		 
	  }
	//identification methods
	  @FindBy(xpath="//input[@id='firstName']") WebElement txtFirstName;
	  @FindBy(xpath="//input[@id='lastName']") WebElement txtLastName;
	  @FindBy(xpath="//input[@id='btnSave']") WebElement btnSave;
		
		//operating methods
		public void enterTextOnFirstName(String txtToEnter){
			txtFirstName.sendKeys(txtToEnter);
			System.out.println(txtToEnter+" entered on FirstName TextBox");
		}
		
		public void enterTextOnLastName(String txtToEnter){
			txtLastName.sendKeys(txtToEnter);
			System.out.println(txtToEnter+" entered on LastName TextBox");
		}
		
		public void clickOnSaveButton(){
			btnSave.click();
			System.out.println("Clicked on Save Button");
		}
	}
