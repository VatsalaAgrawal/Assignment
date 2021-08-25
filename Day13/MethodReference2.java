package com.techment.Day13;
@FunctionalInterface

interface Calculate{
	int add(int a,int b);
}
class Add{
	int addition(int a,int b) {
		return a+b;
	}
}
class Sub{
	int substraction(int a,int b) {
		return a-b;
	}
}

public class MethodReference2 {

	public static void main(String[] args) {
		
		//by using lamda expression
		Calculate cal=(a,b)->a+b;
		System.out.println(cal.add(2, 4));
		
		Calculate cal2=(a,b)->a-b;
		System.out.println(cal2.add(12, 4));
		
		//by using method reference
		
		Add a1=new Add();
		Calculate c1=a1::addition;
System.out.println(c1.add(67, 1));

Sub s1=new Sub();
Calculate c2=s1::substraction;
System.out.println(c2.add(67, 1));
	}

}
