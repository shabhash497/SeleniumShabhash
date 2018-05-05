package com.tng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderOutofClass{
	@BeforeClass
	public void bc(){
		System.out.println("this is first before class method");
	}
	@AfterClass
	public void ac(){
		System.out.println("this is first after class method");
	}

  @Test(dataProvider="getData",dataProviderClass=DPFactory.class)
  public void test(String a,String b){
	System.out.println("this is test method");
	System.out.println(a);
	System.out.println(b);
  }
  
}
