package com.java.basics;

public class ChildClassfoParentStatic  extends StaticMethodsofParentinChild{
	 public static void parentStaticMethod(){
    	 System.out.println("Static method of child class");
     }
	public static void main(String[] args) {
		StaticMethodsofParentinChild ch= new StaticMethodsofParentinChild();
		ch.parentStaticMethod();
		ChildClassfoParentStatic ch1 = new ChildClassfoParentStatic();
		ch1.parentStaticMethod();
		StaticMethodsofParentinChild ch3 = new ChildClassfoParentStatic();
		ch3.parentStaticMethod();
	}

}
