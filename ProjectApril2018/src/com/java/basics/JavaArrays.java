package com.java.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrays {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		System.out.println("shabhash");
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		String str="Shabhash";
		char[] ch = str.toCharArray();
		System.out.println(ch.length);
		ArrayList arrlst = new ArrayList();
		arrlst.add('a');
		arrlst.add("Shabhash");
		arrlst.add("Shaik");
		arrlst.add("Cherry");
		arrlst.add(23);
		arrlst.forEach(value -> System.out.println(value));
		Iterator<String> it  = arrlst.iterator();
	}

}
