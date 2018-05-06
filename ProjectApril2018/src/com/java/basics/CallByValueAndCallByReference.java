package com.java.basics;

public class CallByValueAndCallByReference {
	  int x,y;
	  public CallByValueAndCallByReference(int x,int y){
		  this.x=x;
		  this.y=y;
	  }

	public static void main(String[] args) {
		//call by value means a copy of value will be given to called method so modifications done in method won't refelect in calling class
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference(30,40);
		obj.swap(obj.x,obj.y);
		System.out.println("value of x before "+obj.x);
		System.out.println("value of y before "+obj.y);
		System.out.println("value of x after "+obj.x);
		System.out.println("value of y after "+obj.y);
		System.out.println("*********************************");
		//call by refernce means we will pass reference of object so any modifications done in called method will reflect in calling class
		System.out.println("value of x before "+obj.x);
		System.out.println("value of y before "+obj.y);
		obj.swapByRefernce(obj);
		System.out.println("value of x after "+obj.x);
		System.out.println("value of y after "+obj.y);
	}
	
	public  static void swap(int a,int b){
		int c;
		c=a;
		a=b;
		b=c;
	}
	public static void swapByRefernce(CallByValueAndCallByReference refobj){
		refobj.x=40;
		refobj.y=30;
	}

}
