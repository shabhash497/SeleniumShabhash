package com.tng.basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPFactory {
  @DataProvider
  public String[][] getData(){
	  System.out.println("Data Provider method");
	  String[][] tcdata = new String[2][2];
	  //1st iteration
	  tcdata[0][0]="shabhash";
	  tcdata[0][1]="Shaik";
	  //2nd iteration
	  tcdata[1][0]="Charishma";
	  tcdata[1][1]="Shaik";
	  return tcdata;
  }
}
