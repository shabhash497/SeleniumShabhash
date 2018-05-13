package com.java.basics;

/**/
class Parent{
	public static void main(String[] args) {
		 System.out.println("Main method inside parent class");
	}
}
class Child extends Parent{
	public static void main(String[] args) {//this is method hiding not method overriding
		 System.out.println("Main method inside parent class");
	}
}

public class MainMethodOverridding {
	public static void main(String[] args) {
	Parent p = new Parent();
    p.main(new String[4]);
    Child c = new Child();
    c.main(new String[3]);
    Parent pc = new Child();
    pc.main(new String[6]);
    System.out.println();
	}
}