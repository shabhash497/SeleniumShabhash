package com.tng.basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvocationCountTest {
   @DataProvider
   public Integer[][] getData1(){
	   System.out.println("Data Provider method");
	   Integer[][] data = new Integer[2][2];
	   data[0][0]=20;
	   data[0][1]=30;
	   data[1][0]=40;
	   data[1][1]=50;
	   return data;
   }
   @Test(invocationCount=5,dataProvider="getData1")
   public void sum(Integer a,Integer b){
	   Integer c=a+b;
	   System.out.println("The sum of given no's is "+c);
   }
}
