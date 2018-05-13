package com.list.concepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(3);
		arr.add(2);
		arr.add(5);
		arr.add(4);
		arr.add(4);
		arr.add("Shabhash");
		arr.add('a');
		System.out.println(arr);
		System.out.println(arr.size());
		//ArrayList can holds duplicate values
		//It maintains insertion order
		//It is not synchronized
		//It allows random access
		System.out.println(arr.get(4));
		System.out.println("*************************");
		Iterator it =arr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		arr.forEach(el-> System.out.println(el));
		arr.set(0, 55);
		System.out.println(arr);
	}

}
