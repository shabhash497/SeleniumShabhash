package com.wd.pom;

import org.openqa.selenium.By;

public class OhrmLoc {
	public static By txt_LoginPage_UserName  = By.xpath("//input[@id='txtUsername']");
	public static By txt_LoginPage_Password 		= By.xpath("//input[@id='txtPassword']");
	public static By btn_LoginPage_Login 			= By.xpath("//input[@value='LOGIN']");
	
	public static By lnk_WelcomePage_PIM 			= By.xpath("//a[.='PIM']");
	public static By lnk_WelcomePage_AddEmployee 	= By.xpath("//a[text()='Add Employee']");
	
	public static By txt_AddEmpPage_FirstName		= By.xpath("//input[@id='firstName']");
	public static By txt_AddEmpPage_LastName		= By.xpath("//input[@id='lastName']");
	public static By btn_AddEmpPage_Save			= By.xpath("//input[@id='btnSave']");

}
