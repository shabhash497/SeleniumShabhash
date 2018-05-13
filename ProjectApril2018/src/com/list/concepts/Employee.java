package com.list.concepts;

import java.util.ArrayList;

public class Employee {
    public String name;
    public int age;
    public String detmnt;
    public Employee(String name,int age,String detmnt){
    	this.name=name;
    	this.age=age;
    	this.detmnt=detmnt;
    }
	public static void main(String[] args) {
		Employee e1= new Employee("Shabhash", 25, "AutomaTester");
		Employee e2= new Employee("Cherry", 24, "Devplr");
		ArrayList<Employee> arre = new ArrayList<Employee>();
		arre.add(e1);
		arre.add(e2);
		arre.forEach(obj-> System.out.println(obj.name));
		arre.forEach(obj-> System.out.println(obj.age));
        arre.forEach(obj-> System.out.println(obj.detmnt));
	}

}
