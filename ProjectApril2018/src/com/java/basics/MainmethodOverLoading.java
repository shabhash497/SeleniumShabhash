package com.java.basics;



public class MainmethodOverLoading {

	public static void main(String[] args) {
		System.out.println("Iam main method with String[]");
		MainmethodOverLoading.main(new Integer[5]);
	}
    public static void main(Integer[] args){
    	System.out.println("Iam main method with Integer[]");
    }
    public static void main(String[] args,int a) {
		System.out.println("Iam main method with String[]");
	}
    //main method overloading is possible but JVM will always call main method with "public static void main(String[] args) " signature
}
