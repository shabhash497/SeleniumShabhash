package com.tng.listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.tng.basics.*;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

//@Listeners(com.tng.listeners.ListenerITest.class)
//@Listeners(com.tng.listeners.ListenerIInvokedMethod.class)
public class TestCasesusingItestListeners {
	/*@BeforeClass
	public void bc(){
		System.out.println("this is first before class method");
	}
	@AfterClass
	public void ac(){
		System.out.println("this is first after class method");
	}
*/
  @Test(dataProvider="getData",dataProviderClass=DPFactory.class)
  public void test(String a,String b){
	System.out.println("this is test method");
	System.out.println(a);
	System.out.println(b);
  }
  @Test		
  public void TestToFail()				
  {		
      System.out.println("This method to test fail");					
      AssertJUnit.assertTrue(false);	
  }	
}
