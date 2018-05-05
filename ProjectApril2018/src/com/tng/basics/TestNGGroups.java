package com.tng.basics;

import org.testng.annotations.Test;

public class TestNGGroups {
  @Test(groups={"scooter"})
  public void scooter1(){
	  System.out.println("This is scooter1 method");
  }
  @Test(groups={"cars"})
  public void car1(){
	  System.out.println("This is car1 method");
  }
  @Test(groups={"scooter"})
  public void scooter2(){
	  System.out.println("This is scooter2 method");
  }
  @Test(groups={"cars"})
  public void car2(){
	  System.out.println("This is car2 method");
  }
  @Test(groups={"scooter","cars"})
  public void vehicle(){
	  System.out.println("This is vehicle method");
  }
}
