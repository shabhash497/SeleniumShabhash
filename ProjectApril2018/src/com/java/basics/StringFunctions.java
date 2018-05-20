package com.java.basics;

import java.util.Random;
import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		String str1="shabhash12334534.shaik";
		String str2="shabhash";
		if(str1.equalsIgnoreCase(str2))
		System.out.println("Strings are equal");
		for(int i=str1.length()-1;i>=0;i--){
			System.out.println(str1.substring(i, i+1));
		}
		System.out.println(str1.substring(8,str1.length()-6));
		System.out.println(str1.indexOf("ash"));
		//System.out.println(Character.compare('c', 'a'));
		System.out.println("******************");
		Random rnd = new Random();
		int max=20;
		int min=1;
		for(int i=1;i<=10;i++){
			System.out.println(rnd.nextInt(max-min+1)+min);
		}
	}
}