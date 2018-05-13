package com.java.basics;

public class ChildClassfoParentStatic  extends StaticMethodsofParentinChild{
	 public static void parentStaticMethod(){
    	 System.out.println("Static method of child class");
     }
	public static void main(String[] args) {
		StaticMethodsofParentinChild ch= new StaticMethodsofParentinChild();
		ch.parentStaticMethod();
	}

}
