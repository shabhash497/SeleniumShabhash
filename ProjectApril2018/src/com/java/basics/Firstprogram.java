package com.java.basics;

import java.util.Scanner;

public class Firstprogram {

	public static void main(String[] args) {
		System.out.println("Shabhash");
		Object abj[]=new Object[2];
		abj[0]="babu";
		abj[1]=123;
		System.out.println(abj[1]);
		 Scanner scn = new Scanner(System.in);
	     System.out.println("Enter value of x");
	     int x = scn.nextInt();
	     System.out.println("Enter value of y");
	     int y = scn.nextInt();
	     System.out.println(x+y);
	     System.out.println("Enter your heartbeat name");
	     String name=scn.next();
	     System.out.println("Your heart beat name is"+" "+name);
	     for(int i=1;i<=5;i++){
	    	 System.out.println(i);
	     }
	     String state="AP";
	     switch (state) {
		case "TS":
			System.out.println("Capital of TS is Hyderabad");
			break;
		case "AP":
			System.out.println("Capital of AP is AMARAVATHI");
			break;
		default:
			break;
		}

	}

}
