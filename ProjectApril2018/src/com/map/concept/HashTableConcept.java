package com.map.concept;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// it is similar to hashtable but it is synchronized
		//store the value on the basis of key-val
		//Key-->Object--Hashcode-->value
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		//it contains only unique values
		h1.put(3, "Java");
		//no null key and null values
		//h1.put(null, "Selenium");
		//h1.put(4,null);
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		System.out.println("The values of h1 "+h1);
		System.out.println("The values of h2 "+h2);
		//print all the values of hashtable using enumerator
		Enumeration<String> evales = h2.elements();
		while(evales.hasMoreElements())
		System.out.println(evales.nextElement());
		//print all the values if hashtable using values method
		Collection<String> values = h1.values();
		values.forEach(value->System.out.println(value));
		//print all the keys and values using entryset
		Set s1 = h2.entrySet();
		System.out.println(s1);
		
	}

}
