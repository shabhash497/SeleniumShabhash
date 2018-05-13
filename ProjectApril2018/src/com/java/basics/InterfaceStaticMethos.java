package com.java.basics;

interface InterfaceStaticMethods {
  int x=30;
  public void methodA();
  public static void intstaticmethod(){
	System.out.println("Iam static method inside interface after modification for betterment");  
  }
  default void intdefaultMethod(){
	  System.out.println("Iam default method inside interface after modification");   
  }
}


