package com.java.basics;

public class FinalDemoMethods {

	final void finalMethod(){
		System.out.println("Iam final method in parent class");
	}
	public static void main(String[] args) {
		SubClass sb = new SubClass();
		sb.finalMethod();
	}
	
}
class SubClass extends FinalDemoMethods{

	
}
