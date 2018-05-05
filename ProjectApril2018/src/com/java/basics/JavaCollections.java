package com.java.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class JavaCollections {

	public static void main(String[] args) {
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(34);
		ar1.add(2);
		for(int i=0;i<ar1.size();i++)
			System.out.println(ar1.get(i));
		System.out.println();
		Iterator<Integer> it = ar1.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("Shabhash","Cherry");
		hm.put("babu","laddu");
		System.out.println(hm.get("Shabhash"));
	}

}
