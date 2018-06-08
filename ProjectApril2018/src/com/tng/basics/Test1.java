package com.tng.basics;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	/*@BeforeSuite
	public void bs(){
		System.out.println("This is before suite method");
	}
	@BeforeTest
	public void bt(){
		System.out.println("This is before test method");
	}*/
	@BeforeClass
	public void bc(){	
		System.out.println("This is firest before class method");
	}
	@AfterClass
	public void ac(){
		System.out.println("this is first after class method");

	}
	@BeforeMethod
	public void bm1(){
		System.out.println("this is before method");
	}
    @AfterMethod
    public void am1(){
		System.out.println("this is after method");
	}
	@Test(dependsOnMethods="demo1")
	public void demo() {
		 System.out.println("this is a test method");
	  }
	public void demosecond(){
		System.out.println("this is a test2 method");
	}
	@Test
	  public void demo1() {
		  System.out.println("this is another test method");
	  }
	@BeforeClass
	public void bc1(){
		System.out.println("this is second before class method");
	}
	
	@AfterClass
	public void ac1(){
		System.out.println("this is seond after class method");
	}
}
