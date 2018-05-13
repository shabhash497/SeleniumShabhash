package com.java.basics;

public class WhyJavaMainMethodisPublicAndStatic {

	/*public static void main(String[] args) {
		 1)main method is public because
		    if it is public JVM can call main method from anywhere independent of location of JVM
		   2)main mehod is static because
		     JVM is reponsible to call main method without 
		     If a method of class is static we dont need object of that class to be created for calling static method 
		      so JVM will call main method which is present  inside "WhyJavaMainMethodisPublicAndStatic" class without creating object
		      so memory management 
            3)main method is void because
            JVM calls main method and JVM don't need any return value from called method
            4)
            String[] args
            If you want to pass anyvalue from command line
            Different ways how we can change mai method
          
		
	}
	*/
	/*static public void main(String[] args){
		System.out.println("Main method called by JVM");
	}*/
	/*public static void main(String args[]){
		System.out.println("Main method");
	}
*/
	static public void main(String... args){
		System.out.println("main method");
	}
}
