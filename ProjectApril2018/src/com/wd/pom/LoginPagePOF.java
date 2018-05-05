package com.wd.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOF {

	public LoginPagePOF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='txtUsername']") WebElement txtUserName;
	@FindBy(xpath="//input[@id='txtPassword']") WebElement txtPassword;
	@FindBy(xpath="//input[@value='LOGIN']") WebElement btnLogin;
	//operating methods
		void enterTextOnUserName(String txtToEnter){
			txtUserName.sendKeys(txtToEnter);
			System.out.println(txtToEnter+" entered on UserName TextBox");
		}
		
		public void enterTextOnPassword(String txtToEnter){
			txtPassword.sendKeys(txtToEnter);
			System.out.println(txtToEnter+" entered on Password TextBox");
		}
		
		public void clickOnLoginButton(){
			btnLogin.click();
			System.out.println("Clicked on Login Button");
		}
}
