package com.techment.demo;
class Parent1{
	Parent1(int a)
	{
System.out.println("Parent1 constructor");
	}
}
class Child1 extends Parent1{
Child1()
{
	super(2);
System.out.println("Child1 constructor");
}
}

public class SuperConstructor {
	public static void main(String args[]) {
		Child1 c=new Child1();
		
	}

}

