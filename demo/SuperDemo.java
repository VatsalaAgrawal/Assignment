package com.techment.demo;

class Parent{
	int a=20;
	
}
class child extends Parent{
	int a=10;

	void sum()
	{
		int a=5;
		int c=a+a;
		System.out.println("c "+c);
		int d=this.a+a;
		System.out.println("d "+d);
		int e=super.a+a;
		System.out.println("e "+e);
		int f=super.a+this.a;
		System.out.println("f "+f);
	}
	
}

public class SuperDemo {

	public static void main(String[] args) {
		child c=new child();
		c.sum();
		

	}

}
