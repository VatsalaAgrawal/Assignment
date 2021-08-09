package com.techment.demo;

public class Operator {
public static void main(String args[])
{
	int a=5,b;
	b=a++ + ++a - a--;
	System.out.println(b);
	b= ++a + a-- + --a;
	System.out.println(b);
	
	
}
}
