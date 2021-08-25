package com.techment.Day13;

interface Calculate2{
	int add(int a,int b);
}
class Calculationutil1{
 int addition(int a,int b) {
		return a+b;
	}
	static int substraction(int a,int b) {
		return a-b;
	}
}

public class MethodReference4_Static {

	public static void main(String[] args) {
		Calculationutil1 calculationutil=new Calculationutil1();
		Calculate1 c1=calculationutil::addition;
		System.out.println(c1.add(55, 2));
		Calculate1 c2=Calculationutil1::substraction;
		System.out.println(c2.add(55, 2));

		
	}

}
