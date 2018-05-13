package com.map.concept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import com.list.concepts.Employee;

public class HashMapConcept {

	public static void main(String[] args) {
		// Hashmap is a class that extends AbstractMap Interface
		//AbstractMap extends Map Interface
		//It contains only unique elements
		//stores the value in Key=value pair
		//it may have one null key and multiple null values
		//it maintain no order
		//keyset() will return all keys in set form
		//value() will retunr all values as a collection object
		//hashmap is not synchronized --not thread safe
		//concurrent modification exception--Fail fast condition
		Map<Integer,String> hmp = new HashMap<Integer, String>();
		hmp.put(2, "Shabhash");
		hmp.put(1, "Shaik");
		hmp.put(3, "Selenium");
		hmp.put(1, "what");
		System.out.println(hmp.get(1));
		System.out.println(hmp.get(5));
		Set<Integer> keyw = hmp.keySet();
		keyw.forEach(key-> System.out.println(key));
		Collection<String> values = hmp.values();
		values.forEach(value->System.out.println(value));
		for(Entry et:hmp.entrySet())
			System.out.println(et.getKey()+" *** "+et.getValue());
		Employee e1= new Employee("Shabhash", 25, "AutomaTester");
		Employee e2= new Employee("Cherry", 24, "Devplr");
		HashMap<Integer,Employee> hemp = new HashMap<Integer,Employee>();
		hemp.put(2, e1);
		hemp.put(1, e2);
		for(Entry<Integer,Employee> etemp : hemp.entrySet()){
			Integer key = etemp.getKey();
			Employee et = etemp.getValue();
			System.out.println(key+" Info "+"= "+ et.name +" " + et.age + " "+ et.detmnt);
		}
	}

}
