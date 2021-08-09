package com.techment.demo;
abstract class Bank2{
	void Eligibility()
	{
		System.out.println("Above 18");
	}
	abstract int rateOfInterest(int interestRate);
}
class Axis2 extends Bank2{
	@Override
	int rateOfInterest(int interestRate) {
		
		return interestRate;
	}

}
class SBI2 extends Bank2{

	@Override
	int rateOfInterest(int interestRate) {
		System.out.println("My Bank");
		
		return interestRate;
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		Bank2 b=new Axis2();
		System.out.println(b.rateOfInterest(5));
	}

}

