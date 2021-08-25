package com.techment.Day13;
interface Calculate1{
	int add(int a,int b);
}
class Calculationutil{
	int addition(int a,int b) {
		return a+b;
	}
	int substraction(int a,int b) {
		return a-b;
	}
}
public class MethodReference3 {

	public static void main(String[] args) {
		Calculationutil calculationutil=new Calculationutil();
		Calculate1 c1=calculationutil::addition;
		Calculate1 c2=calculationutil::substraction;
		System.out.println(c1.add(55, 2));
		System.out.println(c2.add(55, 2));

	}

}
