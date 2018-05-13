package com.java.basics;

public class FinalDemo {
   private final int x;
   private final static int y;
   public FinalDemo(int x){
	   this.x=x;
   }
   static{
	   y=20;
   }
   public static void main(String args[]){
	   FinalDemo fd= new FinalDemo(10);
	   System.out.println(fd.x);
	   System.out.println(fd.y);
	   System.out.println(FinalDemo.y);
   }
}
