package com.java.basics;

public class Secondprogram {

	public static void main(String[] args) {
		String[] str= new String[3];
		str[0]="Shabhash";
		str[1]="Loves";
		str[2]="Cherry";
		for(int i=0;i<str.length;i++)
			System.out.print(str[i]+" ");
		char[] ch={'a','b','c'};
		int[] n={3,4,5};
		String name="";
		String name1=name.copyValueOf(ch);
		System.out.println();
		System.out.println(name1);
		System.out.println(name1.copyValueOf(ch));
		char[] copied=new char[name1.length()];
		name1.getChars(0, name1.length(), copied,0);
		System.out.println(copied);
		String sha="";
		for(int i=0;i<ch.length;i++)
			sha=sha+ch[i];
		System.out.println(sha); 
	}
}