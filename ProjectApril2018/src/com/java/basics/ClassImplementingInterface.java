package com.java.basics;

public class ClassImplementingInterface implements  InterfaceStaticMethods{

		public void methodA(){
			System.out.println("Interface method implementation provided by class");
		}
		public static void intstaticmethod(){
			System.out.println("Iam static method inside method implemented by class");  		
	}
		public void intdefaultMethod(){
			  System.out.println("Iam default method inside method implemented by class");   
		  }
		public static void main(String[] args){
			InterfaceStaticMethods it  = new ClassImplementingInterface();
			it.methodA();
			it.intdefaultMethod();
			InterfaceStaticMethods.intstaticmethod();
		}
		}
