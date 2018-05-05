package com.java.basics;

public interface JavaInerfacevsabstractzmethodsdiff {
  //1)In intraface  we cannot declare instance variable by default all variable are public static final 
	/*int a=10;//public static final
  //In interface we cannot declare the instance variables
  public static void interfacemethod(){
	 a=20; 
  }*/
//2)Interface cannot have constructor	
  /*public JavaInerfacevsabstractzmethodsdiff(){
	  
  }*/
//3)Interface cannot have static  and non-static blocks	
 /* static{
	  
  }
  {
	  
  }
  */
  
public abstract class Absclass{
	  int x=10;//instance variable
	  public void demoMethod(){
		  x=20;//we can change the value in case of abstract class
	  }
	  public Absclass(){
		  System.out.println("Inside constructor");//constructors are allowed inside abstract class;
	  }
	  static{
		  System.out.println("Static block inside abstract class");
	  }
	  {
		  System.out.println("Non-static block inside abstract class");
	  }
  }
}
